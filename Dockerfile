# Sử dụng tag có hậu tố -buster (phổ biến)
FROM openjdk:17-jre-slim-buster
# HOẶC tag đơn giản hơn nếu nó tồn tại
# FROM openjdk:17-jre-slim
WORKDIR /app
# app.jar sẽ được tạo ra trong bước Maven trước đó và copy vào.
COPY target/my-java-app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]