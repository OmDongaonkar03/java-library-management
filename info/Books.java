package info;

public class Books {
    
    public String[][] books = new String[10][5];

    public boolean BookUpdate(String name, int price, String author, int Stock){
        if(name != null || price >= 0 || author != null){
            for(int i = 0 ; i < books.length ; i++){
                if(books[i][0] == null){
                    books[i][0] = name;
                    books[i][1] = Integer.toString(price);
                    books[i][2] = author;
                    books[i][3] = "available";
                    books[i][4] = Integer.toString(Stock);
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    public void viewBooks(){
        System.out.println("The Books we have are:");
        for(int j = 0; j < books.length; j++){
            if(books[j][0] != null && books[j][1] != null && books[j][2] != null && books[j][3] != null && books[j][4] != null){
                System.out.println(
                    (j+1) + ") " + 
                    "Name: " + books[j][0] + 
                    ", Price: ₹" + books[j][1] + 
                    ", Author: " + books[j][2] + 
                    ", Status: " + books[j][3] +
                    ", Stock: " + books[j][4]);
            }
        }
    }
}
