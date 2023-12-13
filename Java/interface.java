/*
Interface:

Explanation: An interface in Java is a collection of abstract methods. It defines a contract for classes that implement it. Interfaces allow multiple inheritance and provide a way to achieve abstraction and polymorphism.
*/
// Interface definition
public interface Shape {
    double calculateArea(); // Abstract method
    void draw(); // Another abstract method
}

// Class implementing the Shape interface
public class Circle implements Shape {
    double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        // Code to draw a circle
    }
}
