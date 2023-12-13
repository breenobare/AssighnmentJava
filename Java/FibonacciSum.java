/*
1. Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
By considering the terms in the Fibonacci sequence whose values do not exceed four million, write a Java method to find the sum of all the even- valued terms. 
*/

public class FibonacciSum {

    public static void main(String[] args) {
        int limit = 4000000;

        // Call the method to find the sum of even-valued Fibonacci terms
        int sum = sumEvenFibonacci(limit);

        // Output the result
        System.out.println("The sum of even-valued Fibonacci terms below " + limit + " is: " + sum);
    }

    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int fib1 = 1;
        int fib2 = 2;

        while (fib2 <= limit) {
            // Check if the current term is even
            if (fib2 % 2 == 0) {
                sum += fib2;
            }

            // Calculate the next Fibonacci terms
            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }

        return sum;
    }
}
