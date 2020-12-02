FROM openjdk:11-jdk

MAINTAINER lianchuanguang

WORKDIR /

COPY target/platform-center-eureka-1.0-SNAPSHOT.jar app.jar
EXPOSE 8000

CMD java -jar -Xmx64m -Xms64m  app.jar --spring.profiles.active=prod