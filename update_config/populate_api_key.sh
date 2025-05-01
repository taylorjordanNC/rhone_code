#!/bin/bash

# Generate and export API key
export VLLM_API_KEY=$(python -c 'import secrets; print(secrets.token_urlsafe())')

# Display the generated API key clearly
echo "Your generated API key is: $VLLM_API_KEY"

# Substitute API key into YAML template
envsubst < config-template.yaml > ~/.config/instructlab/config.yaml

echo "Your config.yaml file is now updated with your API key for remote access."