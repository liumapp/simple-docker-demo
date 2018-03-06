#!/bin/bash

title=docker-weba
PROJECT_NAME=docker-weba
IMAGE_NAME=docker-weba

MACHINE_PORT=2222
CONTAINER_PORT=2222

if [ ! -d "target" ]; then
    echo 'find target folder , ready to rm'
    rm -rf "${PROJECT_NAME}/target"
fi

mvn clean install -DskipTests -pl ${PROJECT_NAME} -am

