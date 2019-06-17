FROM openjdk:8-jdk-alpine

LABEL maintener="farukkirisci@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/docker-demo-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} docker-demo.jar

ENTRYPOINT ["java","-jar","/docker-demo.jar"]