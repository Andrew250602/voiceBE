FROM eclipse-temurin:17-jre-focal
WORKDIR /app
# app.jar sẽ được tạo ra trong bước Maven trước đó và copy vào.
COPY target/my-java-app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]