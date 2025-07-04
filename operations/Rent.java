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
                    int quantity = Integer.parseInt(mybooks.books[i][4]);
                    if (quantity > 0) {
                        boolean changeStatus = new Status(mybooks).changeStatus(name);
                        if (changeStatus) {
                            System.out.println("Book Rented: " + name);
                        } else {
                            System.out.println("Failed to rent book");
                        }
                    } else {
                        System.out.println("Stock Unavailable");
                    }
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
}
