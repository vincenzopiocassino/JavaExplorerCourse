/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ShopApp;

import java.util.Arrays;

/**
 *
 * @author Vinscasss
 */
public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        this.setSize(measurement);
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String setSize() {
        return getSize();
    }

    public void setSize(int size) {
        switch (size) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("X");
                break;
        }

    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param item to add
     * @Accept clothing arrays as argument and assigns it to the items istance
     * variable
     */
    public void addItems(Clothing[] item) {
        this.items = item;
    }

    /**
     *
     * @return @Accept clothing arrays as argument and assigns it to the items
     * istance variable
     */
    public Clothing[] getItems() {
        return items;
    }

    /**
     *
     * @return @Accept clothing arrays as argument and assigns it to the items
     * istance variable
     */
    public double getTotalClothingCost() {
        double total = 0;
        for (Clothing cloths : items) {
           System.out.println(cloths.toString());
            total += cloths.getPrice();
        }
        return total;
    }
    
    public double[] getTotalClothingCostBySize(String size) {
        double array[] = new double[2];
        for (Clothing cloths : items) {
            if (cloths.getSize().equalsIgnoreCase(size))
            {
                array[0] += cloths.getPrice();
                array[1] ++; 
            }
            
            
        }
        return array;
    }
    
    
     public double avgPrice(String size) {
        double[] array = this.getTotalClothingCostBySize(size);
        System.out.println("Avg Price: " + (array[0]/array[1]));
        return (array[0]/array[1]);
        
    }
}
