#FROM eclipse-temurin:17-jre-focal
#WORKDIR /app
#COPY target/*.jar app.jar
#
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]

# Use a base image with JDK installed
FROM eclipse-temurin:17-jre-focal

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/my-java-app.jar /app/my-java-app.jar

# Expose the port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "my-java-app.jar"]