# Object-Oriented Programming II Assignment in Java

This repository contains Java code snippets and explanations related to object-oriented programming concepts. The code examples cover topics such as classes, objects, inheritance, polymorphism, and more.

## Author

- **Author:** BREEN OGERO OBARE
- **Reg Number:** SCT221-0990/2021
- **Unit:** OBJECT ORIENTED PROGRAMMING II
---

## Q1. What is the Object Modeling Techniques (OMT)?

Object Modeling Techniques (OMT) is a method for visualizing and documenting software systems using objects, classes, and their relationships. Developed by James Rumbaugh and his colleagues at General Electric Research and Development Center, OMT provides graphical notations for representing object-oriented concepts. It includes three main techniques:

1. **Object Modeling:** Visual representation of classes and objects.
2. **Dynamic Modeling:** Illustrates object interactions over time.
3. **Functional Modeling:** Represents the functional aspects of the system.

---

## Q2. Comparison between Object-Oriented Analysis and Design (OOAD) and Object Oriented Programming (OOP)

**Object-Oriented Analysis and Design (OOAD):** OOAD is a crucial early phase in software development that concentrates on comprehending the problem domain and establishing system requirements. It employs concepts such as objects, classes, relationships, and various diagrams to model real-world entities and interactions, abstracting essential details to create a conceptual model. OOAD results in artifacts like use case diagrams, class diagrams, and sequence diagrams, providing a blueprint for the subsequent implementation phase.

**Object-Oriented Programming (OOP):** OOP is the implementation and execution phase following OOAD, where the design is translated into a working software solution. It involves writing code to create and manipulate objects using classes, with key concepts such as inheritance, polymorphism, and encapsulation. Code is written in a programming language like Java, compiled or interpreted, and executed during runtime. OOP generates executable code from the source code, and objects interact through method calls and message passing, bringing the designed system to life.

---

## Q3. Discuss Mian goals of UML. 	

The Unified Modeling Language (UML) is a standardized modeling language widely used in software engineering for visualizing, specifying, constructing, and documenting the artifacts of a software system. The main goals of UML are to provide a standardized and universally accepted notation for modeling complex systems, fostering better communication and understanding among stakeholders involved in software development. Here are the primary goals of UML:

1. **Standardization:** UML aims to establish a common language and notation for software modeling, allowing developers, analysts, designers, and other stakeholders to communicate effectively regardless of their backgrounds or domains of expertise. This standardization facilitates collaboration and reduces ambiguity in communication.

2. **Visualization:** UML provides a graphical notation for representing various aspects of a software system, including its structure, behavior, and interactions. Through visual diagrams such as class diagrams, sequence diagrams, and activity diagrams, UML helps stakeholders to visualize and comprehend the complex relationships and dynamics within a system.

3. **Specification:** UML serves as a means to specify the structure and behavior of a system in a concise and standardized way. It enables the documentation of requirements, design decisions, and system architecture, offering a comprehensive and clear representation that can be easily communicated and understood.

4. **Modeling Abstractions:** UML allows the abstraction of complex systems by breaking them down into manageable and comprehensible models. It supports various levels of abstraction, from high-level conceptual models to detailed designs, helping stakeholders focus on relevant aspects of the system at different stages of the software development life cycle.

5. **Flexibility:** UML is designed to be flexible and adaptable to various application domains and methodologies. It can be used for modeling a wide range of systems, from business processes to software applications, and it can be applied within different development methodologies, such as object-oriented, component-based, or service-oriented approaches.

---

## Q4. DESCRIBE three advantages of using object oriented to develop an information system.

Object-oriented development (OOD) is a software development paradigm based on the concept of "objects," which encapsulate data and behavior. This approach offers numerous advantages in the development process.
1. **Modularity:**
   - Objects encapsulate data and behavior, providing a natural way to structure and organize code. This modular approach makes it easier to understand, develop, and maintain software.
2. **Reusability:**
   - Objects can be reused in different parts of an application or in different projects. This promotes code reusability, leading to reduced development time and improved consistency.
3. **Flexibility and Extensibility:**
   - The design of an object-oriented system allows for flexibility and extensibility. New classes and objects can be added with ease, and existing ones can be modified or extended without affecting the entire system.
4. **Ease of Maintenance:**
   - The modular nature of object-oriented code makes it easier to maintain. Changes to one part of the system are less likely to impact other parts, reducing the risk of introducing bugs during maintenance.
5. **Abstraction:**
   - Abstraction allows developers to focus on essential details while ignoring non-essential details. This makes it easier to conceptualize and design complex systems by breaking them down into more manageable components.
6. **Encapsulation:**
   - Encapsulation refers to the bundling of data and methods that operate on that data into a single unit or class. This helps in hiding the internal details of an object and exposes only what is necessary, promoting information hiding and reducing system complexity.
7. **Improved Code Organization:**
   - Object-oriented programming (OOP) promotes a more intuitive and natural way of organizing code. This makes it easier for developers to understand the relationships between different components of a system.
8. **Code Maintainability:**
   - Because of the modular and organized nature of object-oriented code, it is generally easier to understand, modify, and maintain. This is particularly important in large and complex software systems.
9. **Support for Real-world Modeling:**
   - OOP allows developers to model real-world entities and their interactions in the software. This alignment between the software model and the real-world problem domain can lead to more intuitive and understandable code.
10. **Support for Inheritance and Polymorphism:**
    - Inheritance allows the creation of new classes based on existing ones, facilitating code reuse and promoting a hierarchical structure. Polymorphism allows objects to be treated as instances of their parent class, enhancing flexibility and generality in the code.
11. **Collaborative Development:**
    - OOP encourages collaborative development by allowing different developers to work on different objects or classes simultaneously, as long as they adhere to the agreed-upon interfaces.
---

## Q5. Briefly explain the following terms as used in object oriented programming. Write a sample java code to illustrate the implementation of the term. 

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
An object is an instance of a class. A class is a blueprint or template that defines the structure and behavior of objects. Objects are fundamental to the object-oriented programming (OOP) paradigm, which is a programming paradigm that uses objects to organize code.
```Java
// Define the Person class
public class Person {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize instance variables
    public Person(String name, int age) {
        this.name = name; // Assign the 'name' parameter to the 'name' instance variable
        this.age = age;   // Assign the 'age' parameter to the 'age' instance variable
    }

    // Instance method to print a greeting
    public void greet() {
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");
    }

    // Main method where the program starts
    public static void main(String[] args) {
        // Create an object of the Person class with name "John" and age 25
        Person myPerson = new Person("John", 25);

        // Call the greet method of the myPerson object to print the greeting
        myPerson.greet();
    }
}
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

## Q6. EXPLAIN the three types of associations (relationships) between objects in object oriented.

### a. Aggregation

Represents a "whole-part" relationship where a class contains another class, but the contained class can exist independently.

### b. Composition

Similar to aggregation, but the lifetime of the contained class is tied to the containing class. If the containing class is destroyed, the contained class is also destroyed.

### c. Association

Represents a relationship between two classes, indicating that objects of one class are related to objects of another class.

---

## Q7. What do you mean by class diagram? Where it is used and also discuss the steps to draw the class diagram with any one example.

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
