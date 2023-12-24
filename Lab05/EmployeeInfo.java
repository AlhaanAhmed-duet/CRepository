/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class EmployeeInfo {
       int salary;
       int noOfHours;
       
       EmployeeInfo() {
           System.out.println("Default Constructor");
       }
       
       public EmployeeInfo(int salary, int noOfHours) {
           this.salary = salary;
           this.noOfHours = noOfHours;
           
       }
       
       public void getInfo() {
           System.out.println("Salary of an employee: $" + this.salary);
           System.out.println("No of Hours worked by an employee: " + this.noOfHours);
       }
       
       public void addWork() {
           if (this.noOfHours > 6) {
               this.salary += 5;
               System.out.println("Your total salary after $5 as bonus: $" + this.salary);
           }
           else {
               System.out.println("Not eligible for the bonus");
           }
       }
}
