# Use an official OpenJDK runtime as a base image
FROM openjdk:21

# Set the working directory in the container


# Copy the JAR file into the container at /app
COPY target/*.jar app.jar


# Expose port 5050 for the Java application
EXPOSE 5050

# Run the Java application when the container launches
CMD ["java", "-jar","/app.jar"]
