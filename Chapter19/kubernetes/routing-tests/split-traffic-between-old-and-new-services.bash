#!/usr/bin/env bash

set -e

old_percentage=$1
new_percentage=$2

kubectl patch virtualservice product --type=json -p="[
  {\"op\": \"add\", \"path\": \"/spec/http/1/route/0/weight\", \"value\": ${old_percentage}},
  {\"op\": \"add\", \"path\": \"/spec/http/1/route/1/weight\", \"value\": ${new_percentage}}
]"

kubectl patch virtualservice recommendation --type=json -p="[
  {\"op\": \"add\", \"path\": \"/spec/http/1/route/0/weight\", \"value\": ${old_percentage}},
  {\"op\": \"add\", \"path\": \"/spec/http/1/route/1/weight\", \"value\": ${new_percentage}}
]"

kubectl patch virtualservice review --type=json -p="[
  {\"op\": \"add\", \"path\": \"/spec/http/1/route/0/weight\", \"value\": ${old_percentage}},
  {\"op\": \"add\", \"path\": \"/spec/http/1/route/1/weight\", \"value\": ${new_percentage}}
]"
