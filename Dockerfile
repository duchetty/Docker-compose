FROM openjdk:17-jdk-slim
COPY target/spring-boot-docker-compose.jar /usr/app/spring-boot-docker-compose.jar.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-boot-docker-compose.jar.jar"]
