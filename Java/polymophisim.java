/*
Polymorphism allows objects of different types to be treated as objects of a common type.
It can be achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).
*/
// Polymorphic method
public void printInfo(Shape shape) {
    System.out.println("Area: " + shape.calculateArea());
}

// Example usage
Circle circle = new Circle();
printInfo(circle); // The Circle object is treated polymorphically
