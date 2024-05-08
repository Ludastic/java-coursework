FROM openjdk:21-jdk-alpine
LABEL authors="titly"

ADD ./backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
