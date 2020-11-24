FROM maven:3.6.3-adoptopenjdk-11 as builder
USER root
WORKDIR /builder
COPY src /builder/src
COPY pom.xml /builder
RUN mvn package -Dmaven.test.skip=true

FROM openjdk:11.0.9.1-jre
WORKDIR /app
EXPOSE 8080
COPY --from=builder /builder/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]