FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/pruebasdocker-0.0.1.jar /app/pruebasdocker-0.0.1.jar

CMD ["java", "-jar", "pruebasdocker-0.0.1.jar"]