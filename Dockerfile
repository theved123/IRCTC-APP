# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY . .

# Make port 8080 available to the world outside this container
EXPOSE 8000

# Run the application when the container launches
CMD ["java", "-jar", "my-application.jar"]
