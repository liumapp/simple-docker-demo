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

* docker build -t liumapp/docker-webc:v1.0.0 .

* docker run -d -p 8082:8082 liumapp/docker-webc:v1.0.0

### push a project to docker hub

* docker login (maybe you need my account access , but sorry for can not offerd)

* docker push liumapp/docker-webc:v1.0.0

* you can search liumapp/docker-webc on http://hub.docker.com

### create a private repository
 
* first of all , you need have a ecs server(CentOS) & install docker  .

    for how to install and use docker in centos :
    
       yum install docker
        
       systemctl start docker
           
       docker run hello-world
       
* install registry2(named distribution in Github)
 
        docker run -d -p 5000:5000 --restart=always --name registry2 registry:2

* change tag of local image : 

        docker images (find your image , for me , it is liumapp/docker-webc)
        
        docker tag liumapp/docker-webc:v1.0.0 ${your server ip}:5000/liumapp/docker-webc:v1.0.0
        
* push to private repository : 

        docker push 118.190.133.67:5000/liumapp/docker-webc:v1.0.0
        
        

