FROM java:8

VOLUME /tmp
ADD ./target/docker-webd-v1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'

EXPOSE 8083

ENTRYPOINT ["java","-Djava.security.egs=file://dev/./urandom","-jar","/app.jar"]
