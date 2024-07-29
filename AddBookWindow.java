//This file contains the class for the add book window.


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EbookManagementSystem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("EBook Management System");

        // Create UI components
        Button addBookButton = new Button("Add Book");
        Button listBooksButton = new Button("List Books");
        Button exitButton = new Button("Exit");

        // Set actions for buttons
        addBookButton.setOnAction(e -> handleAddBook(primaryStage));
        listBooksButton.setOnAction(e -> handleListBooks());
        exitButton.setOnAction(e -> primaryStage.close());

        // Create layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(addBookButton, listBooksButton, exitButton);

        // Set up scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    // Implement methods to handle button actions
    private void handleAddBook(Stage parentStage) {
        new AddBookWindow(parentStage).show();
    }

    private void handleListBooks() {
        // Add logic to open a new window or dialog to display the list of books
        System.out.println("List Books button clicked.");
        // Example: Open a new window to display a list of books
        // new ListBooksWindow();
    }
}
