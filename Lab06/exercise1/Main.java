/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp2;

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
        Product product1 = new Product("EggCrates", 14, 900);
        Product product2 = new Product("Chicken", 10, 780); // adjusted price of chickens
        Product product3 = new Product("Bread", 5, 300);
        
        Store eggstore = new Store("BismillahStore", "Shahab-ud-Din Market, Lines Area, Karachi");
        eggstore.addProduct(product1);
        eggstore.addProduct(product2);
        eggstore.addProduct(product3);
        
        eggstore.displayAll();
        
        Company c1 = new Company("DawnBread");
        
        
        eggstore.searchProduct("Bread");
        eggstore.deleteProduct("Chicken");
        eggstore.displayAll();
        c1.addStore(eggstore);
        
        c1.displayAll();
        
                
    }
    
}
