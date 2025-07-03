package operations;

import info.*;

public class Return {
    Books mybooks;
    
    public Return(Books mybooks){
        this.mybooks = mybooks;
    }

    public void returnBook(String name){
        boolean changed = false;
        if(name != null){
            for(int i = 0; i < mybooks.books.length; i++){
                if (mybooks.books[i] != null && mybooks.books[i][0] != null && mybooks.books[i][0].equalsIgnoreCase(name)) {
                    mybooks.books[i][3] = "available";
                    System.out.println("Book returned successfully");
                    changed = true;
                }
            }
            if(!changed){
                System.out.println("Book not found for action");
            }
        }
    }
}
