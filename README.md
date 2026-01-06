# LLD - Low-Level Design Patterns and Implementations in Java

This repository contains implementations of various Low-Level Design (LLD) patterns and concepts in Java.

## Description

This project demonstrates the practical implementation of fundamental design patterns used in software engineering. Each pattern is implemented with clear, well-documented code examples.

## Design Patterns Included

### 1. Factory Design Pattern
**File:** `FactoryDesign Pattern.java`

The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

**Key Concepts:**
- Interface-based design
- Object creation through factory method
- Decouples client code from object creation logic

**Example Usage:**
```java
NotificationFactory notificationFactory = new NotificationFactory();
Notification notification = notificationFactory.createNotification("EMAIL");
notification.send();
```

### 2. Strategy Design Pattern
**File:** `StrategyDesignPattern.java`

The Strategy Design Pattern is a behavioral pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

**Key Concepts:**
- Interface-based strategy design
- Runtime algorithm selection
- Encapsulation of interchangeable behaviors

**Example Usage:**
```java
PaymentStrategy credit = new Googlepay();
PaymentProcessor process = new PaymentProcessor(credit);
process.ProcessPayments();
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Running the Code

#### Using Command Line:
```bash
# Compile Factory Design Pattern
javac "FactoryDesign Pattern.java"
java FactoryDesignPattern

# Compile Strategy Design Pattern
javac StrategyDesignPattern.java
java StrategyDesignPattern
```

#### Using IDE:
1. Open the project in your preferred IDE
2. Run the main class for each pattern

## Project Structure

```
LLD/
├── FactoryDesign Pattern.java
├── StrategyDesignPattern.java
├── README.md
└── .gitignore
```

## Learning Outcomes

This repository helps in understanding:
- Object-oriented design principles
- Gang of Four (GoF) design patterns
- Best practices for code organization
- Separation of concerns
- Loose coupling and high cohesion

## Contributing

Feel free to contribute by:
- Adding new design patterns
- Improving existing implementations
- Adding more documentation
- Fixing bugs or optimizing code

## Author

**somureddy12**

## License

This project is open source and available under the MIT License.

## Acknowledgments

- Inspired by the Gang of Four design patterns
- Built for educational purposes in understanding LLD concepts

---

**Happy Coding! 🚀**

