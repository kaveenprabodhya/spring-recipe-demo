# Spring Recipe Web App 

## Overview
This is a Recipe Web MVC application built with Spring Boot. The application allows users to manage recipes and ingredients, including creating, reading, updating, and deleting (CRUD) operations.

## Technologies Used
- **Spring Boot** - Framework for building the application
- **Spring MVC** - For creating web applications
- **Spring Data** JPA - For data persistence
- **Thymeleaf** - Template engine for rendering views
- **MySQL** - Database for storing recipes
- **Maven** - Build and dependency management tool

## Architecture
The system follows a layered architecture with the following components:
- **Controller Layer:** Handles HTTP requests and maps them to service methods.
- **Service Layer:** Contains the business logic.
- **Repository Layer:** Manages data access using Spring Data JPA.

## Key Features
- **Spring Boot Auto-Configuration**: Simplifies the configuration of the Spring application by using sensible defaults.
- **Spring MVC**: Utilized for building web applications with a model-view-controller architecture.
- **Spring Data JPA**: Simplifies the data access layer, providing a consistent approach to data access.
- **Project Lombok:** provides annotations to generate getters, setters, constructors, toString, equals, hashCode, and other commonly used methods, reducing the need for boilerplate code.
- **Thymeleaf**: Template engine used to render dynamic content in web pages.
Bootstrap: Used for styling the web application to make it responsive and visually appealing.
- **Validation**: Ensures that the data provided by users is valid before processing.
- Exception Handling: Provides user-friendly error messages and handles unexpected errors gracefully.
- **Logging**: Implements logging using SLF4J and Logback for debugging and monitoring purposes.
- **Testing**: Includes unit tests and integration tests to ensure the application works as expected.

## Database Design
#### Entities and Relationships
- **Recipe**
- **Category**
- **Difficulty**
- **Ingredients**
- **Notes**
- **Unit of Measure**

## Configuration and Setup
### Edit Run Configuration 
```properties
-Dspring.profiles.active=dev
```
### Update the `application.properties` file with your database configuration:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdbname
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
```

## Testing
- **Unit Tests:** Using JUnit and Mockito for testing services and controllers.
- **Integration Tests:** Testing the interaction between different layers.
