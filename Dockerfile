FROM openjdk:8-jdk-alpine
LABEL maintainer="narayan.kumar@emirates.com"
VOLUME /tmp
EXPOSE 8086
ARG JAR_FILE=target/first-app-1.0.0.jar 

# Add the application's jar to the container
ADD ${JAR_FILE} first-app-1.0.0.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/first-app-1.0.0.jar"]