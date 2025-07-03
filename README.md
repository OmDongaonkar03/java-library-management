# Library Management System

A simple console-based library management system built in Java that allows users to manage books with basic CRUD operations.

## Features

- **Add Books**: Add new books with name, price, and author information
- **View Books**: Display all books in the library with their details
- **Rent Books**: Mark books as "not available" when rented
- **Return Books**: Mark books as "available" when returned
- **Delete Books**: Remove books from the library
- **Duplicate Prevention**: Prevents adding books with the same name

## Project Structure

```
src/
├── main/
│   └── Main.java          # Entry point and user interface
├── info/
│   └── Books.java         # Core data structure and book operations
└── operations/
    ├── Add.java           # Book addition functionality
    ├── Delete.java        # Book deletion functionality
    ├── Rent.java          # Book rental functionality
    ├── Return.java        # Book return functionality
    └── Status.java        # Status management utility
```

## Getting Started

### Prerequisites

- Java 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Running the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd library-management-system
   ```

2. Compile the Java files:
   ```bash
   javac -d bin src/**/*.java
   ```

3. Run the application:
   ```bash
   java -cp bin main.Main
   ```

## Usage

When you run the application, you'll see a menu with the following options:

- **Add**: Add a new book to the library
- **Rent**: Rent a book (changes status to "not available")
- **Return**: Return a rented book (changes status to "available")
- **View**: Display all books in the library
- **Delete**: Remove a book from the library
- **Exit**: Close the application

### Example Session

```
Hey! Why are you here ? (Add / Rent / Return / View / Delete / Exit)
add
Enter book name :
The Great Gatsby
Enter book price :
299
Enter book author :
F. Scott Fitzgerald
Book Added: The Great Gatsby

Hey! Why are you here ? (Add / Rent / Return / View / Delete / Exit)
view
The Books we have are:
1) Name: The Great Gatsby, Price: ₹299, Author: F. Scott Fitzgerald, Status: available
```

## Classes Overview

### `Books.java`
- Core data structure using a 2D String array
- Stores book information: name, price, author, and availability status
- Maximum capacity: 10 books
- Provides `BookUpdate()` method for adding books and `viewBooks()` for display

### `Main.java`
- Entry point of the application
- Handles user input and menu navigation
- Coordinates between different operation classes

### Operation Classes
- **`Add.java`**: Handles book addition with duplicate checking
- **`Delete.java`**: Manages book removal from the library
- **`Rent.java`**: Processes book rental requests
- **`Return.java`**: Handles book returns
- **`Status.java`**: Utility class for changing book availability status

## Technical Details

- **Data Storage**: Uses a 2D String array `books[10][4]` to store book information
- **Book Format**: `[name, price, author, status]`
- **Status Values**: "available" or "not available"
- **Input Validation**: Includes basic error handling for price input

## Limitations

- Maximum capacity of 10 books
- Data is not persistent (lost when application closes)
- No user authentication or book ID system
- Basic error handling

## Future Enhancements

- [ ] File-based data persistence
- [ ] Database integration
- [ ] User management system
- [ ] Book search functionality
- [ ] Due date tracking for rentals
- [ ] GUI interface
- [ ] Book categories and genres

## Contributing

This is a learning project. Feel free to fork and experiment with improvements!

## License

This project is open source and available under the [MIT License](LICENSE).

---

*This is my first Java project - a simple library management system to practice object-oriented programming concepts and basic CRUD operations.*
