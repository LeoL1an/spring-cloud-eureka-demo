FROM openjdk:11-jdk

MAINTAINER lianchuanguang

WORKDIR /

COPY target/platform-config-server-1.0-SNAPSHOT.jar app.jar
EXPOSE 8001

CMD java -jar -Xmx64m -Xms64m  app.jar --spring.profiles.active=prod