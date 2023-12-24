/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Employee {
    String name;
    int year;
    String address;
    
    public Employee() {
        System.out.println("Default Constructor!");
    }
    public Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }
    
    public void displayInformation() {
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee joined in year : " + this.year);
        System.out.println("Employee address: " + this.address);
    }
}
