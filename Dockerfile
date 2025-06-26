FROM openjdk:21
EXPOSE 8080
ADD target/spring-boot-github-cicd-action.jar spring-boot-github-cicd-action.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-github-cicd-action"]