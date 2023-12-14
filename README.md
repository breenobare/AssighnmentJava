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

### b. Object

### c. Interface
# Shape Interface and Circle Class

## Overview
Explanation: An interface in Java is a collection of abstract methods. It defines a contract for classes that implement it. Interfaces allow multiple inheritance and provide a way to achieve abstraction and polymorphism.

```java
// Interface definition
public interface Shape {
    double calculateArea(); // Abstract method
    void draw(); // Another abstract method
}
```

### d. Polymorphism

### e. Class

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
