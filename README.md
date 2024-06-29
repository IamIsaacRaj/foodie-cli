# Foodie-cli Project


## 1. Purpose
The purpose of this document is to provide a detailed specification for a command-line interface (CLI) application similar to Zomato. The application aims to provide functionality for customers to choose restaurants, browse dishes, and place orders.

## 1.1 Scope
This application will support the following features:
- Customer registration and login
- Viewing available restaurants
- Browsing dishes from selected restaurants
- Placing orders for dishes

## 2. System Overview
The system is implemented as a simple CLI-based Java application. It includes various classes to represent Customers, Restaurants, Dishes, and Orders.

## Project Structure

The project is structured into several packages:
- `controller`: Contains classes for handling user input and interactions.
- `repository`: Manages data access and storage operations.
- `service`: Implements business logic and services.
- `model`: Defines data models used throughout the application.
- `util`: Utility classes and helper methods.
- `ui`: User interface components for displaying information to the user.
- `exceptions`: Custom exception classes for handling errors.

## Model Classes

### Customer
- Attributes: id, name, email, password
- Encapsulated with private fields
- Includes no-arg constructors, getters, setters
- Overridden hashCode(), equals(), and toString() methods

### Dishes
- Attributes: id, name, description, price
- Encapsulated with private fields
- Includes no-arg constructors, getters, setters
- Overridden hashCode(), equals(), and toString() methods

### Order
- Attributes: id, customer, restaurant, dishes, price
- Encapsulated with private fields
- Includes no-arg constructors, getters, setters
- Overridden hashCode(), equals(), and toString() methods

### Restaurant
- Attributes: id, name, address, menu
- Encapsulated with private fields
- Includes no-arg constructors, getters, setters
- Overridden hashCode(), equals(), and toString() methods

## Data Storage

Data for customers, dishes, and restaurants is stored in CSV format within the `data` folder.


