/*
Create a new class called CalculateG.
Copy and paste the following initial version of the code. Note variables declaration and the types. 
class CalculateG {
public static void main(String[] arguments){ 
(datatype) gravity =-9.81; // Earth's gravity in m/s^2 (datatype) fallingTime = 30; 
(datatype)initialVelocity = 0.0; (datatype) finalVelocity = ; 
(datatype) initialPosition = 0.0; (datatype) finalPosition = ; 
        // Add the formulas for position and velocity
        System.out.println("The object's position after " + fallingTime + " seconds is "
        + finalPosition + " m.");
    // Add output line for velocity (similar to position)
} } 
Modify the example program to compute the position and velocity of an object after falling for 30 seconds, outputting the position in meters. The formula in Math notation is: 
𝑥(𝑡)=0.5∗𝑎𝑡2 +𝑣𝑖𝑡+𝑥𝑖 𝑣(𝑡)=𝑎𝑡+𝑣𝑖 
Run the completed code in Eclipse (Run → Run As → Java Application). 5. Extend datatype class with the following code: 
public class CalculateG { 
public static double multi(......){ // method for multiplication 
} 
// add 2 more methods for powering to square and summation (similar to multiplication)
public static void outline(......){
// method for printing out a result 
}
public static void main(String[] args) { 
// compute the position and velocity of an object with defined methods and print out the
result
} } 
6. Create methods for multiplication, powering to square, summation and printing out a result in CalculateG class.
*/

public class CalculateG {

    public static double multiply(double operand1, double operand2) {
        // Method for multiplication
        return operand1 * operand2;
    }

    public static double square(double base) {
        // Method for powering to square
        return Math.pow(base, 2);
    }

    public static double sum(double operand1, double operand2) {
        // Method for summation
        return operand1 + operand2;
    }

    public static void outline(String message, double result) {
        // Method for printing out a result
        System.out.println(message + result);
    }

    public static void main(String[] args) {
        // Example usage: compute the position and velocity of an object with defined methods

        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        // Calculate final position using the formula: x(t) = 0.5 * a * t^2 + v_i * t + x_i
        finalPosition = sum(multiply(0.5, multiply(gravity, square(fallingTime))), sum(multiply(initialVelocity, fallingTime), initialPosition));

        // Calculate final velocity using the formula: v(t) = a * t + v_i
        finalVelocity = sum(multiply(gravity, fallingTime), initialVelocity);

        // Output the results
        outline("The object's position after " + fallingTime + " seconds is ", finalPosition);
        outline("The object's velocity after " + fallingTime + " seconds is ", finalVelocity);
    }
}
