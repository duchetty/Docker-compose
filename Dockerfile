FROM openjdk:17-jdk-slim
COPY /target/spring-boot-docker-compose.jar app.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]
