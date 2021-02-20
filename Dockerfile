FROM openjdk:8-jdk-alpine
COPY build/libs/*.jar feedback-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/feedback-service.jar"]