🏥 Patient Management Microservices System
📌 Overview
This project is a Microservices-based Patient Management System built using Spring Boot and modern backend technologies.I developed this project mainly for learning and practice purposes, to understand how real-world scalable systems are designed and implemented.

🎯 Purpose
The main goal of this project is to learn:
Microservices Architecture
REST API Development
gRPC Communication
Event-driven Architecture with Kafka
Authentication & Authorization (JWT)
API Gateway
Docker & Containerization


⚙️ Tech Stack
🔹 Backend
Java
Spring Boot
Spring Data JPA
Spring Security

🔹 Communication
REST APIs
gRPC

🔹 Messaging
Apache Kafka
🔹 Database
H2 (initial)
PostgreSQL / MySQL (later setup)

🔹 DevOps & Tools
Docker
Docker Compose
API Gateway
JWT Authentication
OpenAPI (Swagger)

🧩 Microservices Included
Patient Service
Billing Service (gRPC)
Analytics Service (Kafka Consumer)
Auth Service (JWT Authentication)
API Gateway

🚀 Features
✅ CRUD operations for patients
✅ Request validation & error handling
✅ gRPC communication between services
✅ Kafka-based event streaming
✅ JWT authentication & authorization
✅ API Gateway routing & filtering
✅ Dockerized services
✅ Cloud deployment simulation (LocalStack)
✅ Integration testing

🔐 Authentication
Login endpoint generates JWT token
Token is validated via API Gateway
Protected routes require Authorization header

🧪 Testing
Integration tests included
Covers authentication and patient endpoints


📚 Learning Note
⚠️ This project is built purely for learning purposes to understand microservices, distributed systems, and backend architecture.
It is not intended for production use.


🙌 Author
Tanvir Hossain
