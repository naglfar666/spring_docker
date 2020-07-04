FROM openjdk:11

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} SpringApplication.jar

ENTRYPOINT ["java", "-jar", "/SpringApplication.jar"]