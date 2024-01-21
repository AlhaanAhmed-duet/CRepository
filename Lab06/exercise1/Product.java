/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp2;

/**
 *
 * @author alhaanahmed
 */
public class Product {
    private String name;
    private int quantity;
    private double price;
    
    public Product(String name, int quantity, double price) {
               this.name = name;
               this.quantity = quantity;
               this.price = price;
    }
    
    public String getName() {
        return this.name;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public double getPrice() {
        return this.price;
    }
}
