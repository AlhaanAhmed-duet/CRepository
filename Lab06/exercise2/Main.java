/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student std1 = new Student("Ali", "Ahmed", 1, "OOP");
        Student std2 = new Student("Naeem", "Hasan", 2, "Programming Fundamentals");
        
        
        Teacher tutor1 = new Teacher("M.Ahmed", "Alam", 10000, "OOP");
        Teacher tutor2 = new Teacher("M.Jabbar", "Yasir", 15000, "Programming Fundamentals");
        
        std1.displayDetails();
        std2.displayDetails();
        
        tutor1.displayDetails();
        tutor2.displayDetails();
    }
    
}
