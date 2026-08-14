# digital-customer-onboarding
Banking application for secure digital customer onboarding using Java, Spring Boot, Hibernate, REST APIs, and MySQL.
# Digital Customer Onboarding System

A Spring Boot-based banking application that enables customers to open a bank account online through a secure digital onboarding process. The application verifies customer information using OTP authentication and identity validation before creating the account.

---

## Features

- Customer Registration
- Mobile OTP Verification
- Email OTP Verification
- PAN Validation
- Aadhaar Validation
- Customer Profile Management
- RESTful APIs
- CRUD Operations
- Exception Handling
- Input Validation
- MySQL Database Integration

---

## Tech Stack

**Backend**
- Java 8
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

**Database**
- MySQL

**Build Tool**
- Maven

**Tools**
- Postman
- Git
- GitHub
- Eclipse IDE / IntelliJ IDEA

---

## Project Architecture

```
Controller
    │
    ▼
Service
    │
    ▼
Repository (JPA)
    │
    ▼
MySQL Database
```

---

## Project Structure

```
digital-customer-onboarding
│── src/main/java
│── src/main/resources
│── database
│── screenshots
│── postman
│── pom.xml
│── README.md
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/register` | Register a new customer |
| POST | `/verify-mobile-otp` | Verify mobile OTP |
| POST | `/verify-email-otp` | Verify email OTP |
| POST | `/validate-pan` | Validate PAN details |
| POST | `/validate-aadhaar` | Validate Aadhaar details |
| GET | `/customer/{id}` | Get customer details |
| PUT | `/customer/{id}` | Update customer details |
| DELETE | `/customer/{id}` | Delete customer |

---

## Database

The project uses **MySQL** for storing customer information.

Main tables include:

- Customer
- OTP
- Address
- Account

---

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/akanksha-mg18/digital-customer-onboarding.git
```

### 2. Open the Project

Import the project into **Eclipse** or **IntelliJ IDEA** as a Maven project.

### 3. Configure Database

Update the database configuration in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dco_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the Application

Run the main Spring Boot application.

The server starts at:

```
http://localhost:8080
```

### 5. Test APIs

Use **Postman** to test the REST APIs.



## Future Enhancements

- JWT Authentication
- Spring Security
- SMS Gateway Integration
- Email Notifications
- Docker Support
- Microservices Architecture
- Swagger API Documentation


## License

This project is developed for learning and portfolio purposes.
