# 👤 User Management System (Java + JDBC)

## 📌 Overview

This is a console-based User Management System built using Java and MySQL.
It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on user data through a simple menu-driven interface.

---

## 🚀 Features

* ➕ Add new user
* 📋 View all users
* ✏️ Update existing user
* ❌ Delete user
* 🔄 Menu-driven console interface

---

## 🛠️ Tech Stack

* **Java** (Core Java)
* **JDBC** (Java Database Connectivity)
* **MySQL** (Database)

---

## 🧠 Concepts Used

* Database connectivity using JDBC
* PreparedStatement for secure queries
* ResultSet for fetching data
* CRUD operations
* Basic exception handling

---

## ⚙️ Database Setup

### 1. Create Database

```sql
CREATE DATABASE user_management;
```

### 2. Create Table

```sql
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/ved-1046/User_Management_System.git
```

2. Open the project in your IDE (IntelliJ / Eclipse)

3. Update database credentials in code:

```java
String url = "jdbc:mysql://localhost:3306/user_management";
String username = "root";
String password = "your_password";
```

4. Run the `User_Management` class

---

## 💻 Sample Output

```
1. Add User
2. View Users
3. Update User
4. Delete User
5. Exit
```

---

## ⚠️ Notes

* Ensure MySQL server is running
* MySQL Connector/J driver must be added to project
* Do not expose your database password in public repositories

---

## 🔮 Future Improvements

* Add graphical UI (Java Swing / JavaFX)
* Convert to web application using Servlets or Spring Boot
* Add input validation
* Improve error handling

---

## 📚 Learning Purpose

This project is built as a beginner-level backend practice to understand how Java interacts with databases using JDBC.

---

## 👩‍💻 Author

Vedika (ved-1046)
