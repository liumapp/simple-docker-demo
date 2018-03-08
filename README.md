# simple-docker-demo
A simple docker demo with Spring Boot Project . 

## how to use

### build a simple docker image and run it .

* cd docker

* docker build -t nginx:my .

* docker run -d -p 92:80 nginx:my

### stop & rm docker container (including image) .

* docker ps . (find the container id , assume is d066ddb91228)

* docker stop d066ddb91228 .  

* docker rm d066ddb91228

* docker rmi nginx:my

### build a maven project 

* cd docker-webc

* mvn clean package

* docker build -t demo/docker-webc:v1.0.0 .

* docker run -d -p 8082:8082 demo/docker-webc:v1.0.0

