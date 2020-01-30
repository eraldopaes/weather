FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/weather-0.0.1-SNAPSHOT.jar weather.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/weather.jar"]