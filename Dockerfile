FROM openjdk:8-jdk-alpine
MAINTAINER 1270305593@qq.com
VOLUME ["/u01/logs"]
EXPOSE 8989
ADD target/dockerfile-springboot-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]