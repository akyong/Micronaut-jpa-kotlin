FROM openjdk:14-alpine
COPY build/libs/micronaut-data-kotlin-*-all.jar micronaut-data-kotlin.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-data-kotlin.jar"]