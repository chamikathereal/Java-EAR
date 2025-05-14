# 🚀 Java-EAR

This project is a modular **Jakarta EE 10** enterprise application developed using **Maven**. It follows the standard multi-module EAR structure, including:

- `core` – Shared model classes.
- `ejb` – Stateless session beans exposing business logic via remote interfaces.
- `web` – Servlet-based front-end consuming EJBs.
- `ear` – EAR module that packages all components into a deployable archive.
  
---

## 📦 Project Structure

```

JIAT-EAR/
├── core/        # Contains entity classes (like Product)
├── ejb/         # EJB module with business logic
├── web/         # WAR module with servlets
└── ear/         # EAR packaging module

````

## 🧱 Modules Overview

### `core` Module

- Provides serializable model classes shared across the application.
- Example class: `Product.java`

### `ejb` Module

- Contains a stateless EJB `ProductSessionBean` implementing the `ProductService` remote interface.
- Performs operations like:
  - Get product by ID
  - Get all products
  - Add/update/delete product (currently empty implementations)

### `web` Module

- Provides a servlet `Home.java` that connects to the `ProductService` EJB.
- Displays a simple HTML response using servlet API.

### `ear` Module

- Packages the entire application using the `maven-ear-plugin`.
- Includes `core.jar`, `ejb.jar`, and `web.war`.

## 💻 Technologies Used

- **Jakarta EE 10**
- **Maven**
- **GlassFish 7 / Payara / WildFly** (Jakarta EE compatible servers)
- **Java 11**
- **Servlets & EJB (Stateless Beans)**

## 🚀 How to Deploy

1. **Build all modules** using:
   ```bash
   mvn clean install

2. **Deploy the EAR file** (`ear/target/ee-ear.ear`) to a Jakarta EE compatible application server like:

   * GlassFish 7.x
   * Payara 6.x
   * WildFly 28+

3. **Access the application**:

   ```
   http://localhost:8080/ee-app/home
   ```

## 🔧 Future Enhancements

* Connect EJB to a real database using JPA and persistence.xml.
* Implement full CRUD operations in `ProductSessionBean`.
* Improve the front-end using JSP/JSF or modern frontend frameworks.
* Add authentication and authorization using Jakarta Security.

## 👨‍💻 Author

**Chamika Indudunu**
📧 [chamikathereal@gmail.com](mailto:chamikathereal@gmail.com)
📍 Sri Lanka

## 📁 License

This project is licensed under the MIT License. Feel free to use and modify it for learning or enterprise purposes.




