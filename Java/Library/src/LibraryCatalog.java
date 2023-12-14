//This fixed the errors on bookshop by using the keyword static
import java.util.Scanner;

public class LibraryCatalog {
    //create an object of scanner class
    static Scanner input = new Scanner (System.in);

    //variable declaration
    static String author, publisher, tittle, ISBN, yearPublished;
    // private static method without parameters and return type
    public static void addBook(){
        //ask user to enter details and get book details
        System.out.println("Enter book tittle");
        //get book tittle
        tittle = input.nextLine();
        System.out.println("Enter ISBN");
        ISBN = input.nextLine();
        System.out.println("Enter Author");
        author = input.nextLine();
    }
    public static void displayDetails(){
        System.out.println("Book Details");
        System.out.println("Tittle: " + tittle);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author);
    }
}

