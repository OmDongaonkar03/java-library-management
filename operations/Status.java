package operations;

import info.Books;

public class Status {
    Books mybooks;

    public Status(Books mybooks) {
        this.mybooks = mybooks;
    }
    
    public boolean changeStatus(String name){
        if (name != null) {
            for (int k = 0; k < mybooks.books.length; k++) {
                if (mybooks.books[k][0] != null && mybooks.books[k][0].equalsIgnoreCase(name)) {
                    mybooks.books[k][3] = "not available";
                    return true;
                }
            }
        }
        return false;
    }
}
