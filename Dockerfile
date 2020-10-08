FROM openjdk:14
WORKDIR /
ADD target/intern-test.jar intern-test.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "intern-test.jar"]
VOLUME /test-volume
