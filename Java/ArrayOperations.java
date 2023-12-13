/*
Question three: [15 marks]
Write a Java program that takes 15 values of type integer as inputs from user, store the values in an array.
a)	Print the values stored in the array on screen.
b)	 Ask user to enter a number, check if that number (entered by user) is present in array or not. If it is present print, “the number found at index (index of the number) ” and the text “number not found in this array”
c)	Create another array, copy all the elements from the existing array to the new array but in reverse order. Now print the elements of the new array on the screen
d)	Get the sum and product of all elements of your array. Print product and the sum each on its own line.
*/

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part a: Read 15 values from the user and store them in an array
        int[] originalArray = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        // Part b: Print the values stored in the array and check if a specific number is present
        System.out.println("\nValues stored in the array:");
        printArray(originalArray);

        System.out.print("Enter a number to check its presence in the array: ");
        int numberToCheck = scanner.nextInt();
        int index = findNumberIndex(originalArray, numberToCheck);

        if (index != -1) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Part c: Create another array in reverse order and print its elements
        int[] reversedArray = reverseArray(originalArray);
        System.out.println("\nElements of the reversed array:");
        printArray(reversedArray);

        // Part d: Get the sum and product of all elements of the array
        int sum = calculateSum(originalArray);
        int product = calculateProduct(originalArray);

        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);

        scanner.close();
    }

    // Helper method to print elements of an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to find the index of a number in the array
    private static int findNumberIndex(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1; // Number not found
    }

    // Helper method to create a reversed copy of an array
    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Helper method to calculate the sum of elements in an array
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Helper method to calculate the product of elements in an array
    private static int calculateProduct(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
}
