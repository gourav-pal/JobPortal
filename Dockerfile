# Use a lightweight JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy project files
COPY . .

# Package the application
RUN ./mvnw clean package -DskipTests

# Expose port (update if you use a different port)
EXPOSE 8080

# Run the JAR
CMD ["java", "-jar", "target/spring-boot-rest-0.0.1-SNAPSHOT.jar"]
