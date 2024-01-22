FROM eclipse-temurin:17-jre-jammy

COPY build/libs/second-first-api-0.0.1-SNAPSHOT.jar service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service.jar"]