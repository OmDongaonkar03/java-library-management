package info;

public class Books {
    
    public String[][] books = new String[10][4];

    public boolean BookUpdate(String name, int price, String author){
        if(name != null || price >= 0 || author != null){
            for(int i = 0 ; i < books.length ; i++){
                if(books[i][0] == null){
                    books[i][0] = name;
                    books[i][1] = Integer.toString(price);
                    books[i][2] = author;
                    books[i][3] = "available";
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
            if(books[j][0] != null){
                System.out.println(
                    (j+1) + ") " + 
                    "Name: " + books[j][0] + 
                    ", Price: ₹" + books[j][1] + 
                    ", Author: " + books[j][2] + 
                    ", Status: " + books[j][3]);
            }
        }
    }
}
