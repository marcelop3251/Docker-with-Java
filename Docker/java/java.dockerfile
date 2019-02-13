FROM openjdk:8 
MAINTAINER Marcelo Garcia Palma

COPY /java/docker-java/build/libs/docker-java-0.0.1-SNAPSHOT.jar /usr/src/docker-java-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD java -jar /usr/src/docker-java-0.0.1-SNAPSHOT.jar



