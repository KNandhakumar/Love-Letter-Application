# 💌 Love Letter App - Backend (Spring Boot)

A heartfelt project built using **Spring Boot** that allows users to write, send, and view love letters. Designed with clean architecture, RESTful APIs, and real-world CRUD operations. ❤️

## 📌 Features

- 📬 Send beautiful love letters
- 📜 View all letters (ToWhom, FromWhom, Message, Date)
- ✏️ Update your heartfelt messages
- ❌ Delete when the love fades
- 💾 Save all in a database (H2/MySQL)

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL / H2 (based on setup)
- REST API
- Maven

## 📁 Folder Structure

```text
src/
├── controller/
├── service/
├── model/
└── repository/


## 🛠️ API Endpoints

| Method | Endpoint             | Description        |
|--------|----------------------|--------------------|
| GET    | /api/letters         | Get all letters    |
| POST   | /api/letters         | Send a new letter  |
| PUT    | /api/letters/{id}    | Update a letter    |
| DELETE | /api/letters/{id}    | Delete a letter    |

## 🌐 How to Run

```bash
# Clone the repo
git clone https://github.com/yourusername/love-letter-backend.git
cd love-letter-backend

# Build & Run
./mvnw spring-boot:run
