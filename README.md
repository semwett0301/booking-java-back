# Booking System Backend

A Spring Boot REST API that emulates booking.com functionality for hotel reservations and user management.

## Project Structure

- **`code/`** - Backend Spring Boot application
- **`documentation/`** - Draw.io templates and diagrams

## Tech Stack

- **Java 11**
- **Spring Boot 2.7.2**
- **Spring Data JPA** - Data persistence
- **Spring Web** - REST API
- **PostgreSQL** - Primary database
- **H2** - In-memory database for development
- **MapStruct** - Entity-DTO mapping
- **Lombok** - Code generation
- **Maven** - Build tool

## API Endpoints

### Cities
- `GET /cities/top?amount={n}` - Get top N popular cities
- `GET /cities/part?part={name}` - Search cities by partial name

### Hotels
- `GET /hotels` - Get hotels with filtering criteria

### Users
- `POST /users/registration` - Register new user
- `POST /users/login` - User authentication
- `GET /users/{id}` - Get user by ID

## Features

- User registration and authentication
- City search and popularity ranking
- Hotel search and filtering
- Booking management
- Review system
- Payment and refund handling

## Getting Started

1. Configure PostgreSQL database in `application.properties`
2. Run `mvn spring-boot:run` from the `code/` directory
3. API runs on `http://localhost:8080`
4. CORS enabled for `http://localhost:3000` (frontend)

## Documentation

The `documentation/` folder contains Draw.io templates for:
- Database schema diagrams
- API architecture diagrams
- Use case diagrams
- Data flow diagrams