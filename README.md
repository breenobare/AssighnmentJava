# Object-Oriented Programming II Assignment in Java

This repository contains Java code snippets and explanations related to object-oriented programming concepts. The code examples cover topics such as classes, objects, inheritance, polymorphism, and more.

## Author

- **Author:** BREEN OGERO OBARE
- **Reg Number:** SCT221-0990/2021
- **Unit:** OBJECT ORIENTED PROGRAMMING II

## Table of Contents

1. [Object Modeling Techniques (OMT)](#object-modeling-techniques-omt)
2. [Comparison between Object-Oriented Analysis and Design (OOAD) and Object Analysis and Design (OOP)](#comparison-between-object-oriented-analysis-and-design-ooad-and-object-analysis-and-design-oop)
3. [Main Goals of UML](#main-goals-of-uml)
4. [Advantages of Object-Oriented Development](#advantages-of-object-oriented-development)
5. [Terms in Object-Oriented Programming](#terms-in-object-oriented-programming)
   - a. [Constructor method](#constructor-method)
   - b. [Object](#object)
   - c. [Interface](#interface)
   - d. [Polymorphism](#polymorphism)
   - e. [Class](#class)
6. [Types of Associations in Object-Oriented Programming](#types-of-associations-in-object-oriented-programming)
   - a. [Aggregation](#aggregation)
   - b. [Composition](#composition)
   - c. [Association](#association)
7. [Class Diagram](#class-diagram)
   - a. [Definition](#definition)
   - b. [Usage](#usage)
   - c. [Steps to Draw a Class Diagram](#steps-to-draw-a-class-diagram)
8. [Palindrome Checker GUI](#palindrome-checker-gui)
9. [Array Operations](#array-operations)

---

## Object Modeling Techniques (OMT)

Object Modeling Techniques (OMT) is a method for visualizing and documenting software systems using objects, classes, and their relationships. Developed by James Rumbaugh and his colleagues at General Electric Research and Development Center, OMT provides graphical notations for representing object-oriented concepts. It includes three main techniques:

1. **Object Modeling:** Visual representation of classes and objects.
2. **Dynamic Modeling:** Illustrates object interactions over time.
3. **Functional Modeling:** Represents the functional aspects of the system.

---

## Comparison between Object-Oriented Analysis and Design (OOAD) and Object Analysis and Design (OOP)

### Object-Oriented Analysis and Design (OOAD)

Methodology combining object-oriented techniques with a systematic approach. Focuses on analyzing, designing, and implementing a system, creating a detailed design before implementation.

### Object Analysis and Design (OOP)

*(Note: Assuming OOP refers to Object-Oriented Programming)*

Programming paradigm using objects (instances of classes) to organize code. Subset of OOAD, involving the implementation phase based on the design.

---

## Main Goals of UML

1. **Standardization:** UML provides a standardized way to visualize and document system designs.
2. **Flexibility:** Adaptable for various system types and industries.
3. **Clarity:** Aims to improve communication by offering a common visual language.

---

## Advantages of Object-Oriented Development

1. **Reusability:** Objects can be reused across applications, promoting modular and efficient development.
2. **Modularity:** Encapsulation of data and behavior within objects leads to maintainable code.
3. **Flexibility and Extensibility:** Supports creating new classes and extending existing ones, providing a flexible development framework.

---

## Terms in Object-Oriented Programming

### a. Constructor method
A constructor is a special method used for initializing objects. It has the same name as the class and doesn't have a return type, not even void. Constructors are called automatically when an object is created, and they are used to set initial values for the object's attributes or perform any necessary setup.
```java
public class MyClass {
    // Fields or attributes
    private int myNumber;   // An integer attribute
    private String myString; // A String attribute

    // Constructor
    public MyClass(int number, String str) {
        // Initialize the object's attributes with the values passed as parameters
        this.myNumber = number; // Assign the value of 'number' to 'myNumber'
        this.myString = str;    // Assign the value of 'str' to 'myString'
    }
}

```
### b. Object
```
```
### c. Interface
An interface in Java is a collection of abstract methods. It defines a contract for classes that implement it. Interfaces allow multiple inheritance and provide a way to achieve abstraction and polymorphism.

```java
// Interface definition
public interface Shape {
    double calculateArea(); // Abstract method
    void draw(); // Another abstract method
}
```

### d. Polymorphism
Polymorphism allows objects of different types to be treated as objects of a common type. It can be achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).
```java
// Polymorphic method
public void printInfo(Shape shape) {
    System.out.println("Area: " + shape.calculateArea());
}

// Example usage
Circle circle = new Circle();
printInfo(circle); // The Circle object is treated polymorphically
```

### e. Class
A class is a blueprint or template for creating objects. It defines the structure and behavior of objects. A class encapsulates data (attributes) and methods (functions) that operate on that data.
```java
// Class definition
public class Student {
    // Fields (attributes)
    String name;
    int age;

    // Constructor method
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void study() {
        System.out.println(name + " is studying.");
    }
}

// Creating an object of the Student class
Student student1 = new Student("Alice", 20);
```

---

## Types of Associations in Object-Oriented Programming

### a. Aggregation

Represents a "whole-part" relationship where a class contains another class, but the contained class can exist independently.

### b. Composition

Similar to aggregation, but the lifetime of the contained class is tied to the containing class. If the containing class is destroyed, the contained class is also destroyed.

### c. Association

Represents a relationship between two classes, indicating that objects of one class are related to objects of another class.

---

## Class Diagram

### a. Definition

A class diagram is a type of static structure diagram that describes the structure of a system by showing the system's classes, their attributes, operations (methods), and the relationships among them.

### b. Usage

Class diagrams are used for visualizing, documenting, and designing the structure of object-oriented systems.

### c. Steps to Draw a Class Diagram

1. **Identify classes:** Identify the main classes in the system.
2. **Identify relationships:** Determine how classes are related (association, aggregation, composition).
3. **Add attributes and methods:** List the attributes and methods for each class.
4. **Draw connections:** Use lines to represent relationships between classes.
5. **Add multiplicities:** Specify the number of objects involved in each relationship.
6. **Review and refine:** Ensure the diagram accurately represents the system's structure.

---

## Palindrome Checker GUI

---

## Array Operations
