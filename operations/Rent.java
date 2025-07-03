package operations;

import info.Books;

public class Rent {
    Books mybooks;

    public Rent(Books mybooks) {
        this.mybooks = mybooks;
    }

    public void rentBook(String name) {
        if (name != null) {
            for (int i = 0; i < mybooks.books.length; i++) {
                if (mybooks.books[i][0].equalsIgnoreCase(name)) {
                    boolean changeStatus = new Status(mybooks).changeStatus(name);
                    if (changeStatus) {
                        System.out.println("Book Rented: " + name);
                    } else {
                        System.out.println("Failed to rent book");
                    }
                    return;
                }
            }
            System.out.println("Book not found");
        }
    }
}
