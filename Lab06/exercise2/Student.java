/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Student extends Person {
    int id;
    String courseName;
    public Student(String firstName, String lastName, int id, String courseName) {
           super(firstName, lastName);
           this.id = id;
           this.courseName = courseName;
           }
    
    @Override
    public void displayDetails() {
        System.out.println("First Name: " + super.getFirstName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("ID: "+ this.id);
        System.out.println("Course name: " + this.courseName);
    }
    
    
    
    }
/*}*/
