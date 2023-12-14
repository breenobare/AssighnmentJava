//This implements the bookshop code using a connection to database using JDBC and MySQL

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseConnection {
    // JDBC URL, username, and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/library_catalog";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Database connection, statement, and result set
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            // Menu loop for user interaction
            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Show books");
                System.out.println("2. Add a book");
                System.out.println("3. Remove a book");
                System.out.println("4. Exit");

                // Read user choice
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                // Switch statement based on user choice
                switch (choice) {
                    case 1:
                        // Show books
                        showBooks(connection);
                        break;

                    case 2:
                        // Add a book
                        addBook(connection, scanner);
                        break;

                    case 3:
                        // Remove a book
                        removeBook(connection, scanner);
                        break;

                    case 4:
                        // Exit the program
                        System.out.println("Exiting the program.");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            // Print stack trace in case of exceptions
            e.printStackTrace();
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                // Print stack trace in case of exceptions during resource closure
                e.printStackTrace();
            }
        }
    }

    // Method to show all books in the database
    private static void showBooks(Connection connection) throws SQLException {
        // Your SQL query (retrieve all books from the 'books' table)
        String sql = "SELECT * FROM books";

        // Create a PreparedStatement object and execute the query
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Display book details
            System.out.println("\nList of Books:");
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String ISBN = resultSet.getString("ISBN");
                String author = resultSet.getString("author");

                System.out.println("Title: " + title + ", ISBN: " + ISBN + ", Author: " + author);
            }
        }
    }

    // Method to add a new book to the database
    private static void addBook(Connection connection, Scanner scanner) throws SQLException {
        // Prompt the user to enter book details
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Enter the ISBN of the book:");
        String ISBN = scanner.nextLine();
        System.out.println("Enter the author of the book:");
        String author = scanner.nextLine();

        // Your SQL query (insert data into the 'books' table)
        String sql = "INSERT INTO books (title, ISBN, author) VALUES (?, ?, ?)";

        // Create a PreparedStatement object and execute the query
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set values for placeholders
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, ISBN);
            preparedStatement.setString(3, author);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        }
    }

    // Method to remove a book from the database
    private static void removeBook(Connection connection, Scanner scanner) throws SQLException {
        // Prompt the user to enter the ISBN of the book to be removed
        System.out.println("Enter the ISBN of the book you want to remove:");
        String ISBN = scanner.nextLine();

        // Your SQL query (remove a book from the 'books' table)
        String sql = "DELETE FROM books WHERE ISBN = ?";

        // Create a PreparedStatement object and execute the query
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set the value for the placeholder
            preparedStatement.setString(1, ISBN);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        }
    }
}
