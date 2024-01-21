/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp2;

/**
 *
 * @author alhaanahmed
 */
public class Store {
    private String name;
    private String location;
    private Product productList[] = new Product[100];
    private int nbProduct;
    
    public Store (String name, String location) {
        this.name = name;
        this.location = location;

    }
    public String getName() {
        return this.name;
    }
    
    public void addProduct(Product p) {
        productList[nbProduct] = p;
        nbProduct++;
    }
    
    public boolean searchProduct(String productName) {
        boolean found = true;
        for (int i = 0; i < nbProduct; i++) {
            if (productName.equalsIgnoreCase(productList[i].getName())) {
                System.out.println("Found Item at :" + this.name);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Not Found anywhere!");
        }
        return found;
    }
    public Product deleteProduct(String productName) {
        Product deleteP = productList[nbProduct];
        for (int i = 0; i < nbProduct; i++) {
            if (productName.equalsIgnoreCase(productList[i].getName())) {
                nbProduct--;
            }
        }
        return deleteP;
    }
    public void displayAll() {
        for (int i = 0; i < nbProduct; i++) {
            System.out.println("Store Name: " + this.name);
            System.out.println("*************************");
            System.out.println("Product Name: " + productList[i].getName());
            System.out.println("Quantity: " + productList[i].getQuantity());
            System.out.println("Price: Rs." + productList[i].getPrice());
            System.out.println("--------------------------");
        }
    }
    
    
}
