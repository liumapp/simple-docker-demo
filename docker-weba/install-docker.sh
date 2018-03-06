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

docker stop ${IMAGE_NAME}
docker rm ${IMAGE_NAME}
docker rmi ${IMAGE_NAME}

mvn package docker:build -DskipTests -DImageName=${IMAGE_NAME} -DExposePort=${CONTAINER_PORT}

docker login

docker run -t -i -p ${MACHINE_PORT}:${CONTAINER_PORT} -h ${IMAGE_NAME} --name ${IMAGE_NAME} ${IMAGE_NAME}:latest