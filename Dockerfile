PROJECT_NAME=docker-weba
IMAGE_NAME=docker-weba
MACHINE_PORT=2222
CONTAINER_PORT=2222
RUN_MODE=-i -t

if [ ! -d ${PROJECT_NAME}/target];then
rmdir /s/q ${PROJECT_NAME}/target
fi