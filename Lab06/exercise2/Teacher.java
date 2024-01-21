/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Teacher extends Person {
    int salary;
    String coursename;
    
    public Teacher(String firstName, String lastName, int salary, String coursename) {
        super(firstName, lastName);
        this.salary = salary;
        this.coursename = coursename;
    
    }
    
    @Override
    public void displayDetails() {
        System.out.println("First Name: " + super.getFirstName());
        System.out.println("Last Name: " + super.getLastName());
        System.out.println("Salary: " + this.salary);
        System.out.println("Course; " + this.coursename);
        
        
    
    }
}
