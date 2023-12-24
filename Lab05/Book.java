/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Book {
    String name;
    String author;
    String ISBN;
    int noOfPages;
    
    Book() {
        System.out.println("Default Book Constructor");
    }
    Book(String name,String author,String ISBN, int noOfPages) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.noOfPages = noOfPages;
    }
    
    public void displayBookInfo() {
        System.out.println("Name of the Book: " + this.name);
        System.out.println("Author of the Book: " + this.author);
        System.out.println("ISBN of the Book: " + this.ISBN);
        System.out.println("No of Pages in the Book: " + this.noOfPages);
    }
}
