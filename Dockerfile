FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy everything
COPY . .

# ✅ Give permission to execute mvnw
RUN chmod +x mvnw

# ✅ Package the app
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
