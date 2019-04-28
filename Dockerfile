FROM openjdk:8
ADD target/docker-lab-spring.jar docker-lab-spring.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","docker-lab-spring.jar"]

