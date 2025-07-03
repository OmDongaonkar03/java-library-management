package main;

import info.*;
import operations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books library = new Books();
        Add adder = new Add(library);
        Rent rent = new Rent(library);
        Delete delete = new Delete(library);
        Return bookReturn = new Return(library);

        while (true) {
            System.out.println("\nHey! Why are you here ? (Add / Rent / Return / View / Delete / Exit)");
            String choice = sc.nextLine().trim().toLowerCase();

            switch (choice) {
                case "add":
                    System.out.println("Enter book name :");
                    String name = sc.nextLine().toString();

                    int Price = 0;
                    try{
                        System.out.println("Enter book price :");
                        Price = Integer.parseInt(sc.nextLine());
                    }catch(NumberFormatException e){
                        System.out.println("Invalid price");
                    }

                    System.out.println("Enter book author :");
                    String Author = sc.nextLine().toString();
                    adder.AddBooks(name, Price, Author);
                    break;

                case "rent":
                    System.out.println("Which book do you want to rent ?");
                    String rentReq = sc.nextLine().toString();
                    rent.rentBook(rentReq);
                    break;

                case "return":
                    System.out.println("Which book do you want to return ?");
                    String returnReq = sc.nextLine().toString();
                    bookReturn.returnBook(returnReq);
                    break;
                case "view":
                    library.viewBooks();
                    break;
                case "delete":
                    System.out.println("Which book do you want to delete ?");
                    String deleteReq = sc.nextLine().toString();
                    delete.deleteBook(deleteReq);
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
