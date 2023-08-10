# Use an appropriate base image for your application
FROM eclipse-temurin:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]
