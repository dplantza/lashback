# Lashback API

A Spring Boot REST API backend service.

## Requirements

- Java 17 or higher
- Maven 3.6+

## Project Structure

```
src/
├── main/
│   ├── java/com/lashback/
│   │   ├── api/
│   │   │   └── Application.java       # Main Spring Boot application class
│   │   └── controller/
│   │       └── HealthController.java  # Sample REST controller
│   └── resources/
│       └── application.properties     # Spring Boot configuration
└── test/
    └── java/com/lashback/           # Test classes
```

## Building the Project

```bash
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

The API will start on `http://localhost:8080`

## Available Endpoints

- `GET /` - Welcome message
- `GET /health` - Health check status
- `GET /h2-console` - H2 Database console (development only)

## Configuration

Application settings can be modified in `src/main/resources/application.properties`

## Development

### IDE Setup

This project is best developed using:
- IntelliJ IDEA (Community or Ultimate)
- VS Code with Spring Boot Extension Pack
- Eclipse IDE for Java Developers

### Hot Reload

For development, you can use Spring Boot DevTools by adding it to your `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

## License

This project is licensed under the MIT License.
