FROM openjdk:11

RUN mkdir /var/springapp

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} SpringApplication.jar

ENTRYPOINT ["java", "-jar", "/SpringApplication.jar", "--spring.config.location=/var/springapp/application.properties"]