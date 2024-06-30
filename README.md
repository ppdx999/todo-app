# Todo Application

This is a simple Todo application built with Spring Boot, PostgreSQL, and Lombok. It provides basic CRUD functionality for managing Todo items.

![Todo app's top page image](/assets/demo-top.png)

## Features

- Create new Todo items
- Retrieve a list of all Todo items
- Retrieve details of a specific Todo item by ID
- Update existing Todo items
- Delete Todo items

## Prerequisites

- Java 17 or later
- PostgreSQL database
- Gradle
- A text editor or IDE of your choice

## Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/yourusername/todo-application.git
cd todo-application
```

### Step 2: Configure the Database

1. Start PostgreSQL and create a new database and user.

```sql
CREATE DATABASE tododb;
CREATE USER yourusername WITH ENCRYPTED PASSWORD 'yourpassword';
GRANT ALL PRIVILEGES ON DATABASE tododb TO yourusername;
```

2. Update the `application.properties` file with your database credentials.

```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tododb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Step 3: Build and Run the Application

1. Navigate to the project directory and build the application.

```bash
./gradlew clean build
```

2. Run the application.

```bash
./gradlew bootRun
```

The application should now be running at `http://localhost:8080`.

## API Endpoints

You can use tools like `curl` or Postman to interact with the API.

### Get all Todo items

```bash
curl -X GET http://localhost:8080/api/todos
```

### Get a specific Todo item by ID

```bash
curl -X GET http://localhost:8080/api/todos/{id}
```

### Create a new Todo item

```bash
curl -X POST http://localhost:8080/api/todos -H "Content-Type: application/json" -d '{"title": "New Todo", "completed": false}'
```

### Update an existing Todo item

```bash
curl -X PUT http://localhost:8080/api/todos/{id} -H "Content-Type: application/json" -d '{"title": "Updated Todo", "completed": true}'
```

### Delete a Todo item

```bash
curl -X DELETE http://localhost:8080/api/todos/{id}
```

## Project Structure

```
src/main/java
    └── com
        └── example
            └── demo
                ├── DemoApplication.java
                ├── model
                │   └── Todo.java
                ├── repository
                │   └── TodoRepository.java
                ├── service
                │   └── TodoService.java
                └── controller
                    └── TodoController.java
```

## Dependencies

- Spring Boot
- Spring Data JPA
- PostgreSQL Driver
- Lombok

## Contributing

Contributions are welcome! Please create a pull request or submit an issue if you find any bugs or have suggestions for improvements.

## License

This project is licensed under the MIT License.
