/*
Class:

Explanation: A class is a blueprint or template for creating objects. It defines the structure and behavior of objects. A class encapsulates data (attributes) and methods (functions) that operate on that data.
*/
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
