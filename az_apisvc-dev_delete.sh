#!/bin/bash

#source ./apisvc-prod.env
source ./monolith-dev.env

az containerapp delete \
  --name "$AZ_CONTAINER_NAME" \
  --resource-group "$AZ_RESOURCE_GROUP" \