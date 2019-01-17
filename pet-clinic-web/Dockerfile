FROM openjdk:8-jdk-alpine
MAINTAINER "laurent.morissette@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR=target/pet-clinic-web-*.jar
ARG END_JAR=pet-clinic-web.jar
ADD ${JAR} ${END_JAR}
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/pet-clinic-web.jar"]


