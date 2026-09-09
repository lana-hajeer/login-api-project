# Spring Boot Login REST API 🚀

A lightweight and secure backend authentication API built with **Java Spring Boot** and **Maven**.

## 📌 Features
- RESTful API endpoint (`/api/login`) supporting `POST` requests.
- Accepts JSON payloads and maps them using `@RequestBody` to a custom `User` model.
- Tested and verified via API clients (Postman/Thunder Client) with successful `HTTP 200 OK` responses.

## 🛠️ Tech Stack
- **Java**
- **Spring Boot**
- **Maven**

## 🚀 How to Run
1. Clone or download the repository.
2. Open the project in your favorite IDE (IntelliJ, NetBeans, or VS Code).
3. Run the `DemoApplication.java` file.
4. Send a `POST` request to `http://localhost:8080/api/login` with a JSON body:
```json
{
    "username": "admin",
    "pass": "12345"
}
