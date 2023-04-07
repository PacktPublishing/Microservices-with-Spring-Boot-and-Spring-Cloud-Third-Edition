#!/usr/bin/env bash

source env.bash

CLIENT_REDIRECT_URI=https://my.redirect.uri
API_NAME=product-composite
API_URL=https://localhost:8443/product-composite

# set -x
set -e

AT=$(curl -s --request POST \
  --url https://$TENANT/oauth/token \
  --header 'content-type: application/json' \
  --data "{\"client_id\":\"$MGM_CLIENT_ID\",\"client_secret\":\"$MGM_CLIENT_SECRET\",\"audience\":\"https://$TENANT/api/v2/\",\"grant_type\":\"client_credentials\"}" | jq -r .access_token)

# Update the tenant
echo "Update the tenant, set its default connection to a user dictionary..."
curl -s -H "Authorization: Bearer $AT" -X PATCH  -H "Content-Type: application/json" -d '{"default_directory":"Username-Password-Authentication"}' https://$TENANT/api/v2/tenants/settings | jq .default_directory

# Create reader application
createClientBody='"callbacks":["https://my.redirect.uri"],"app_type":"non_interactive","grant_types":["authorization_code","implicit","refresh_token","client_credentials","password","http://auth0.com/oauth/grant-type/password-realm"],"oidc_conformant":true,"token_endpoint_auth_method":"client_secret_post"'
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients?fields=name | jq -r '.[] | select(.name == "reader") | .name') ]
then
  echo "Reader client app already exists"
else
  echo "Creates reader client app..."
  curl -s -H "Authorization: Bearer $AT" -X POST -H "Content-Type: application/json" -d "{\"name\":\"reader\",$createClientBody}" https://$TENANT/api/v2/clients | jq .
fi
READER_CLIENT_ID=$(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients | jq -r '.[] | select(.name == "reader") | .client_id')
READER_CLIENT_SECRET=$(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients | jq -r '.[] | select(.name == "reader") | .client_secret')

# Create writer application
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients?fields=name | jq -r '.[] | select(.name == "writer") | .name') ]
then
  echo "Writer client app already exists"
else
  echo "Creates writer client app..."
  curl -s -H "Authorization: Bearer $AT" -X POST -H "Content-Type: application/json" -d "{\"name\":\"writer\",$createClientBody}" https://$TENANT/api/v2/clients | jq .
fi
WRITER_CLIENT_ID=$(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients | jq -r '.[] | select(.name == "writer") | .client_id')
WRITER_CLIENT_SECRET=$(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients | jq -r '.[] | select(.name == "writer") | .client_secret')

# Sleep 1 sec to avoid a "429: Too Many Requests, global limit has been reached"...'
sleep 1

# Create the API
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" "https://$TENANT/api/v2/resource-servers" | jq -r ".[] | select(.name == \"$API_NAME\") | .name") ]
then
  echo "API $API_NAME ($API_URL) already exists"
else
  echo "Creates API $API_NAME ($API_URL)..."
  curl -s -H "Authorization: Bearer $AT" -X POST -H "Content-Type: application/json" -d "{\"name\": \"$API_NAME\", \"identifier\": \"$API_URL\", \"scopes\": [{ \"value\": \"product:read\", \"description\": \"Read product information\"}, {\"value\": \"product:write\", \"description\": \"Update product information\"}]}" https://$TENANT/api/v2/resource-servers | jq .
fi

# Create the user
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" --get --data-urlencode "email=$USER_EMAIL" https://$TENANT/api/v2/users-by-email | jq -r ".[] | select(.email == \"$USER_EMAIL\") | .email") ]
then
  echo "User with email $USER_EMAIL already exists"
else
  echo "Creates user with email $USER_EMAIL..."
  curl -s -H "Authorization: Bearer $AT" -X POST  -H "Content-Type: application/json" -d "{\"email\": \"$USER_EMAIL\",  \"connection\": \"Username-Password-Authentication\", \"password\": \"$USER_PASSWORD\"}" https://$TENANT/api/v2/users | jq .
fi


# Grant access to the API for the reader client app
clientGrantsCount=$(curl -s -H "Authorization: Bearer $AT" --get --data-urlencode "audience=$API_URL" --data-urlencode "client_id=$READER_CLIENT_ID" https://$TENANT/api/v2/client-grants | jq length)
if [[ "$clientGrantsCount" -ne 0 ]]
then
  echo "Client grant for the reader app to access the $API_NAME API already exists"
else
  echo "Create client grant for the reader app to access the $API_NAME API..."
  curl -s -H "Authorization: Bearer $AT" -X POST  -H "Content-Type: application/json" -d "{\"client_id\":\"$READER_CLIENT_ID\",\"audience\":\"$API_URL\",\"scope\":[\"product:read\"]}" https://$TENANT/api/v2/client-grants | jq .
  echo
fi

# Grant access to the API for the writer client app
clientGrantsCount=$(curl -s -H "Authorization: Bearer $AT" --get --data-urlencode "audience=$API_URL" --data-urlencode "client_id=$WRITER_CLIENT_ID" https://$TENANT/api/v2/client-grants | jq length)
if [[ "$clientGrantsCount" -ne 0 ]]
then
  echo "Client grant for the writer app to access the $API_NAME API already exists"
else
  echo "Create client grant for the writer app to access the $API_NAME API..."
  curl -s -H "Authorization: Bearer $AT" -X POST  -H "Content-Type: application/json" -d "{\"client_id\":\"$WRITER_CLIENT_ID\",\"audience\":\"$API_URL\",\"scope\":[\"product:read\",\"product:write\"]}" https://$TENANT/api/v2/client-grants | jq .
  echo
fi

# Echo Auth0 - OAuth2 settings
echo
echo "Auth0 - OAuth2 settings:"
echo
echo export TENANT=$TENANT
echo export WRITER_CLIENT_ID=$WRITER_CLIENT_ID
echo export WRITER_CLIENT_SECRET=$WRITER_CLIENT_SECRET
echo export READER_CLIENT_ID=$READER_CLIENT_ID
echo export READER_CLIENT_SECRET=$READER_CLIENT_SECRET
