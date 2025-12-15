FROM eclipse-temurin:17-jre-focal
WORKDIR /app
# app.jar sẽ được tạo ra trong bước Maven trước đó và copy vào.
# Ví dụ: Thay my-java-app.jar bằng tên thực tế
COPY target/web-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]