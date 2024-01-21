/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp2;

/**
 *
 * @author alhaanahmed
 */
public class Company {
    private String name;
    private Store arrayStore[] = new Store[100];
    private int nbStore;
    
    public Company (String name) {
        this.name = name;
    }
    
    public void addStore(Store store) {
        arrayStore[nbStore] = store;
        nbStore++;
    }
    
    public int nbOfStore(String productName) {
        int count = 1;
        for (int i = 0; i < nbStore; i++) {
            if (productName.equals(arrayStore[i].getName())) {
                count++;
                System.out.println("Products are available in the following stores: " + count);
            }
            
        }
        return count;
    }
    public void displayAll() {
        for (int i = 0; i < nbStore; i++) {
            System.out.println(arrayStore[i].getName() + " is available");
            
        }
    
    }
}
