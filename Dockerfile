FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy all files
COPY . .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Package the Spring Boot app
RUN ./mvnw clean package -DskipTests

# Expose app port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "target/spring-boot-rest-0.0.1-SNAPSHOT.jar"]
