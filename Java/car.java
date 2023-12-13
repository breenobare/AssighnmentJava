/*
 Object:

Explanation: An object is an instance of a class. It is a self-contained unit that consists of data (attributes) and methods (functions) that operate on the data. Objects are created from classes and represent real-world entities or concepts.
*/

public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Other methods and fields
}

// Creating an object of the Car class
Car myCar = new Car("Toyota", 2022);
