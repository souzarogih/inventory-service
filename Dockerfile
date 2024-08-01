FROM openjdk:17-jdk-slim

COPY /target/*.jar saga-inventory-service-app.jar
EXPOSE 8092
ENTRYPOINT ["java", "-jar", "saga-inventory-service-app.jar"]