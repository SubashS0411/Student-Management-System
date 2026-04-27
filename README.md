# 🎓 Enterprise Student Management API

A robust, production-ready RESTful microservice built with **Spring Boot 3** and **MySQL**. 

Unlike standard CRUD tutorials, this project is engineered using enterprise best practices, including a strict 3-Tier Architecture, the Data Transfer Object (DTO) pattern to secure database entities, and a Global Exception Handler for seamless frontend integration.

### 🚀 Key Technical Features
* **Decoupled Architecture:** Strict separation of concerns using Controller, Service, and Repository layers.
* **Data Security (DTOs):** Database entities are never exposed to the client; all data is transferred via secure DTOs.
* **Robust Validation:** Implements `@Valid` to defend the database against malformed JSON payloads.
* **Global Exception Handling:** Custom `@RestControllerAdvice` intercepts Java crashes and translates them into clean, predictable JSON error messages for frontend consumption (Next.js/React ready).
* **ORM Integration:** Utilizes Spring Data JPA and Hibernate for automated database schema generation and querying.

### 🛠️ Tech Stack
* **Language:** Java 17+
* **Framework:** Spring Boot (v4.0.6)
* **Database:** MySQL
* **ORM:** Spring Data JPA / Hibernate
* **Tools:** Maven, Postman, IntelliJ IDEA
