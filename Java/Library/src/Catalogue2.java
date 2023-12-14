
//This implements the bookshop code using arrays
import java.util.Scanner;

public class Catalogue2 {
    static Scanner input = new Scanner(System.in);

    // Define a Book class to represent book details
    static class Book {
        String title;
        String ISBN;
        String author;

        Book(String title, String ISBN, String author) {
            this.title = title;
            this.ISBN = ISBN;
            this.author = author;
        }
    }

    // Array to store books
    static Book[] books;

    public static void addBooks() {
        System.out.println("Enter the number of books you want to add:");
        int numBooks = input.nextInt();
        input.nextLine(); // consume the newline character

        // Initialize the array based on the user's input
        books = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter book title for book " + (i + 1));
            String title = input.nextLine();
            System.out.println("Enter ISBN for book " + (i + 1));
            String ISBN = input.nextLine();
            System.out.println("Enter Author for book " + (i + 1));
            String author = input.nextLine();

            // Create a new Book object and store it in the array
            books[i] = new Book(title, ISBN, author);
        }
    }

    public static void displayDetails() {
        System.out.println("Book Details");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Title: " + books[i].title);
            System.out.println("ISBN: " + books[i].ISBN);
            System.out.println("Author: " + books[i].author);
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        // Call the addBooks function
        addBooks();

        // Call the displayDetails function
        displayDetails();
    }
}
