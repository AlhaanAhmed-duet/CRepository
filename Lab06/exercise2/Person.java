/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Person {
    private String firstName;
    private String lastName;
    
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
           return this.lastName;
        }
    public void displayDetails() {
        System.out.println("Name: " + this.getFirstName());
        System.out.println("Name: " + this.getLastName());

    }
    
    
}
