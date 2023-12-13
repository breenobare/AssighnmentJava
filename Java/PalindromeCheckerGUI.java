/*
A palindrome number is a number that remain the same when read from behind or front  ( a number that is equal to reverse of number) for example,  353 is palindrome because reverse of 353 is 353 (you see the number remains the same). But a number like 591 is not palindrome because reverse of 591 is 195 which is not equal to 591. Write Java program to check if a number entered by the user is palindrome or not. You should provide the user with a GUI interface to enter the number and display the results on the same interface.
The interface:

*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PalindromeCheckerGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Palindrome Checker");

        // Create UI components
        TextField numberField = new TextField();
        Button checkButton = new Button("Check Palindrome");
        Label resultLabel = new Label();

        // Set action for the button
        checkButton.setOnAction(e -> {
            String input = numberField.getText();
            boolean isPalindrome = isPalindrome(input);
            resultLabel.setText("Is Palindrome: " + isPalindrome);
        });

        // Create layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(new Label("Enter a number:"), numberField, checkButton, resultLabel);

        // Set up the scene
        Scene scene = new Scene(layout, 300, 150);

        // Show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanInput = input.replaceAll("\\s", "").toLowerCase();

        // Compare the string with its reverse
        return cleanInput.equals(new StringBuilder(cleanInput).reverse().toString());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
