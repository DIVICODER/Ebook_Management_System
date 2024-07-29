## EBook Management System - JavaFX Application
The EBook Management System is a simple JavaFX application designed to manage a collection of eBooks. This application allows users to add new books to the collection, list all books in the collection, and exit the application. Below is a detailed description of the application and its functionality.

# Main Application Class: EbookManagementSystem
This is the entry point of the application, extending the Application class provided by JavaFX. The start method is overridden to set up the primary stage and user interface.

# UI Components:
1. Add Book Button: When clicked, this button will trigger an action to add a new book to the collection.
2. List Books Button: When clicked, this button will trigger an action to list all books in the collection.
3. Exit Button: When clicked, this button will close the application.
   
# Layout:
A VBox layout is used to arrange the buttons vertically with a spacing of 10 units and padding of 10 units on all sides.
The VBox layout is added to the scene, which is set on the primary stage.

# Event Handling:
Add Book Button Action: This is handled by the handleAddBook method, which currently prints a message to the console. In a complete application, this would open a new window or dialog for adding book details.
List Books Button Action: This is handled by the handleListBooks method, which currently prints a message to the console. In a complete application, this would open a new window or dialog to display the list of books.

# Exit Button Action:
This simply closes the primary stage, thus exiting the application.
