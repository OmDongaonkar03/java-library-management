package operations;

import info.Books;

public class Add {
    Books myadd;

    public Add(Books booksRef) {
        this.myadd = booksRef; 
    }

    public void AddBooks(String name, int price, String author){
        boolean alreadyExists = false;

        for(int i = 0; i < myadd.books.length; i++){
            if(myadd.books[i][0] != null && myadd.books[i][0].equalsIgnoreCase(name)){
                alreadyExists = true;
                break;
            }
        }

        if(alreadyExists){
            System.out.println("Book Already Exists");
        } else {
            boolean success = myadd.BookUpdate(name, price, author);
            if(success) {
                System.out.println("Book Added: " + name);
            } else {
                System.out.println("Library is full or name is invalid.");
            }
        }
    }
}
