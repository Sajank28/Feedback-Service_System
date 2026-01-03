⭐ Feedback Service – Java Spring Boot Backend

A production-ready REST API built with Java & Spring Boot to manage customer feedback and reviews.
Designed using clean layered architecture, validation, and global exception handling — aligned with real-world backend development standards.

👨‍💻 Why This Project Matters
This project demonstrates my ability to:
Design RESTful APIs from scratch
Implement business logic & validations
Work with databases using JPA/Hibernate
Apply clean code & layered architecture
Handle errors gracefully using global exception handling
Built as part of hands-on backend interview preparation and real-world practice.

🛠️ Tech Stack
Java 17
Spring Boot 3
Spring Data JPA (Hibernate)
PostgreSQL
Maven
Postman

🏗️ Architecture Overview
Controller → Service → Repository → Database

✔ Separation of concerns
✔ Scalable & maintainable structure
✔ Interview-ready design

📁 Project Structure
com.sajan.feedback
 ├── controller    # REST APIs
 ├── service       # Business logic
 ├── repository    # Data access layer
 ├── model         # JPA entities
 ├── exception     # Custom & global exceptions

🌐 Key API Capabilities
➕ Submit feedback with rating & comments
📄 Fetch all feedback records
⭐ Filter feedback by rating
✏️ Update existing feedback
🗑️ Delete feedback
⚠️ Centralized error handling

📊 Feedback Entity
Field	Description
id	Auto-generated primary key
name	Feedback author
rating	Integer (1–5)
comment	Optional feedback
createdAt	Auto-generated timestamp
⚠️ Validation & Error Handling
Rating validation (1–5)
Invalid ID handling
Centralized exception responses using @RestControllerAdvice

Sample Error Response
{
  "error": "Rating must be between 1 and 5",
  "timestamp": "2026-01-03T11:25:40"
}

▶️ How to Run
git clone https://github.com/your-username/feedback-service.git
cd feedback-service
mvn spring-boot:run

🎯 Skills Demonstrated
REST API design
Spring Boot best practices
JPA & Hibernate ORM
Input validation
Exception handling
Clean code & maintainability
Backend interview readiness

🚀 Planned Enhancements
Pagination & sorting
Swagger (OpenAPI documentation)
DTOs & MapStruct
JWT authentication
Docker support
Unit testing (JUnit & Mockito)

👨‍💻 Author
Sajan
Sr Java Backend Developer
Skills: Java | Spring Boot | PostgreSQL | REST APIs
