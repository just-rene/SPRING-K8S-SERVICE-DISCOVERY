FROM ubuntu:latest
LABEL maintainer="ft"
EXPOSE 8080
RUN apt-get update && \
    apt-get install -y openjdk-21-jdk;
COPY target/service-discovery-spring-k8s-0.0.1-SNAPSHOT.jar /home
ENTRYPOINT ["java","-jar","/home/service-discovery-spring-k8s-0.0.1-SNAPSHOT.jar", "8080"]