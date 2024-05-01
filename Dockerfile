FROM openjdk:22-ea-21-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","./demo.jar"]