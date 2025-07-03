package operations;

import info.*;

public class Delete {
    Books mybooks;

    public Delete(Books mybooks) {
        this.mybooks = mybooks;
    }

    public void deleteBook(String name){
        String[][] originalBooks = mybooks.books;
        int originalLength = originalBooks.length;

        int count = 0;
        for (int i = 0; i < originalLength; i++) {
            if (originalBooks[i][0] != null && !originalBooks[i][0].equalsIgnoreCase(name)) {
                count++;
            }
        }

        String[][] newBooks = new String[count][4];
        int newIndex = 0;

        for (int i = 0; i < originalLength; i++) {
            if (originalBooks[i][0] != null && !originalBooks[i][0].equalsIgnoreCase(name)) {
                newBooks[newIndex][0] = originalBooks[i][0];
                newBooks[newIndex][1] = originalBooks[i][1];
                newBooks[newIndex][2] = originalBooks[i][2];
                newBooks[newIndex][3] = originalBooks[i][3];
                newIndex++;
            }
        }
        mybooks.books = newBooks;
        if(count == originalLength){
            System.out.println("No book found with that name");
        }else{
            System.out.println("Book deleted: " + name);
        }
    }
}
