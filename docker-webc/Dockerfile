FROM java:8

ADD ./target/docker-webc-v1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'

EXPOSE 8082

ENTRYPOINT ["java","-jar","/app.jar"]



