# CustomerOrderProject

A Spring Boot REST API project for managing customer order items using Spring Data JPA and an H2 in-memory database.

## 🚀 Technologies Used

- Java 26
- Spring Boot 4.1.0
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- IntelliJ IDEA

---

## 📁 Project Structure

```
src
 ├── controller
 │     └── ItemController.java
 ├── entity
 │     └── Item.java
 ├── repository
 │     └── ItemRepository.java
 ├── service
 │     └── ItemService.java
 └── CustomerOrderProjectApplication.java
```

---

## ⚙️ Configuration

**Server Port**

```
8081
```

**Database**

```
H2 In-Memory Database
```

**H2 Console**

```
http://localhost:8081/h2-console
```

Database URL

```
jdbc:h2:mem:testdb
```

Username

```
sa
```

Password

```
(leave empty)
```

---

## ▶️ Run the Project

Clone the repository

```bash
git clone https://github.com/your-username/CustomerOrderProject.git
```

Open the project in IntelliJ IDEA.

Run

```
CustomerOrderProjectApplication.java
```

The application starts at

```
http://localhost:8081
```

---

# REST API Endpoints

## 1. Add Item

**POST**

```
http://localhost:8081/item
```

Sample Request

```json
{
    "name": "Chicken Biryani",
    "price": 250,
    "type": "Main Course"
}
```

Sample Response

```json
{
    "id": 1,
    "name": "Chicken Biryani",
    "price": 250.0,
    "type": "Main Course"
}
```

---

## 2. Get All Items

**GET**

```
http://localhost:8081/item/all
```

---

## 3. Get Item By ID

**GET**

```
http://localhost:8081/item/1
```

---

# Sample Data

| ID | Name | Price | Type |
|----|-----------------|------:|--------------|
| 1 | Chicken Biryani | 250 | Main Course |
| 2 | Veg Fried Rice | 180 | Main Course |
| 3 | Paneer Butter Masala | 220 | Curry |
| 4 | Masala Dosa | 120 | Breakfast |
| 5 | Chocolate Milkshake | 150 | Beverage |

---

# Features

- Add new food items
- Retrieve all items
- Retrieve item by ID
- Spring Data JPA integration
- H2 Database support
- RESTful APIs
- Maven project structure

---

# Testing

The APIs can be tested using:

- Postman
- Thunder Client
- Swagger (if added)

---

# Future Enhancements

- Customer API
- Order API
- DTO Implementation
- Validation
- Exception Handling
- MySQL Integration
- Swagger Documentation

---

## Author

**Sanjeev**

Spring Boot REST API Project
