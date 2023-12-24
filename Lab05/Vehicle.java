/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Vehicle {
    int no_of_seats;
    int no_of_wheels;
    String name;
    
    Vehicle() {
        System.out.println("Default Constructor for Vehicle Object");
    }
    public Vehicle(int no_of_seats, int no_of_wheels, String name) {
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
        this.name = name;
    }
    
    public void displayVehicleInfo() {
        System.out.println("Vehicle Name: " + this.name);
        System.out.println("No of wheels: " + this.no_of_wheels);
        System.out.println("No of seats: " + this.no_of_seats);
        
    }
    
}
