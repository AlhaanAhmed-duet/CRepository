/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alhaanahmed-22F-bscs-88
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Program no.1 logic implemented here 
        and as usual we are creating a single file containing multiple classes
        to avoid redundancy of the files making*/
        
        
        Employee employee1 = new Employee("Robert", 1994, "64C-WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, "26B-WallsStreet");
        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
        
//        Program no. 2 logic implemented here


        EmployeeInfo emp1 = new EmployeeInfo(3000, 7);
        emp1.getInfo();
        emp1.addWork();
        
        /* Program no. 3 logic here */
        
        Vehicle motorcycle = new Vehicle(1, 2, "Motorcycle");
        Vehicle car = new Vehicle(4, 4, "Car");
        motorcycle.displayVehicleInfo();
        car.displayVehicleInfo();
        
//        Program no.4 logic implemented here

        Year year = new Year(1974, 2023);
        year.yearCalc();
        
//        Program no. 5 logic implemented here

        Book book = new Book("The adventures of Huckleberry Finn", "Tom Sawyer", "11554478899", 312);
        book.displayBookInfo();
        Book book2 = new Book();
    }
    
}
