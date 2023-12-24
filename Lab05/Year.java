/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alhaanahmed
 */
public class Year {
    int year;
    int age;
    int currentYear;
    
    Year(int year, int currentYear) {
        this.year = year;
        this.currentYear = currentYear;
    }
    
    public void yearCalc() {
        this.age = this.currentYear - this.year;
        System.out.println("His age is : " + this.age + " and was born on: " + this.year);
    }
}
