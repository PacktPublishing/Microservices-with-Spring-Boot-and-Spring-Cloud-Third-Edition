#!/usr/bin/env bash

#
# *** THIS SCRIPT RESET THE DEFINITIPONS IN THE TENANT ***
#

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

# Delete reader application
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients?fields=name | jq -r '.[] | select(.name == "reader") | .name') ]
then
  echo "Delete reader client app..."
  readerId=$(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients | jq -r '.[] | select(.name == "reader") | .client_id')
  curl -s -H "Authorization: Bearer $AT" -X DELETE https://$TENANT/api/v2/clients/$readerId
else
  echo "Reader client app already deleted"
fi

# Delete writer application
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients?fields=name | jq -r '.[] | select(.name == "writer") | .name') ]
then
  echo "Delete writer client app..."
  writerId=$(curl -s -H "Authorization: Bearer $AT" https://$TENANT/api/v2/clients | jq -r '.[] | select(.name == "writer") | .client_id')
  curl -s -H "Authorization: Bearer $AT" -X DELETE https://$TENANT/api/v2/clients/$writerId
else
  echo "Writer client app already deleted"
fi

# Delete the API
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" "https://$TENANT/api/v2/resource-servers" | jq -r ".[] | select(.name == \"$API_NAME\") | .name") ]
then
  echo "Delete API $API_NAME ($API_URL)..."
  apiID=$(curl -s -H "Authorization: Bearer $AT" "https://$TENANT/api/v2/resource-servers" | jq -r ".[] | select(.name == \"$API_NAME\") | .id")
  curl -s -H "Authorization: Bearer $AT" -X DELETE https://$TENANT/api/v2/resource-servers/$apiID
else
  echo "API $API_NAME ($API_URL) already deleted"
fi

# Delete the user
if [ ! -z $(curl -s -H "Authorization: Bearer $AT" --get --data-urlencode "email=$USER_EMAIL" https://$TENANT/api/v2/users-by-email | jq -r ".[] | select(.email == \"$USER_EMAIL\") | .email") ]
then
  userID=$(curl -s -H "Authorization: Bearer $AT" --get --data-urlencode "email=$USER_EMAIL" https://$TENANT/api/v2/users-by-email | jq -r ".[] | select(.email == \"$USER_EMAIL\") | .user_id")
  echo "Delete user with email $USER_EMAIL..."
  curl -s -H "Authorization: Bearer $AT" -X DELETE https://$TENANT/api/v2/users/$userID
else
  echo "User with email $USER_EMAIL already deleted"
fi