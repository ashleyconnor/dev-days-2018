FROM openjdk:8-jdk-alpine
LABEL maintainer "Ashley Connor <me@ashleyconnor.co.uk>"
VOLUME /tmp
COPY target/actor_api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]