FROM openjdk:11

COPY target/docker-springboot.jar /usr/app/docker-springboot.jar

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker-springboot.jar"]