/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ShopApp;

/**
 *
 * @author Vinscasss
 */
public class Clothing implements Comparable<Clothing> {

    private String description;
    private double price;
    private String size;
    //private final double MIN_PRICE = 10;
    //private final double TAX_RATE = 0.2;

    /**
     *
     * @param description
     * @param price
     * @param size
     */
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price * (1 + Clothing.getTax());
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        if (price < Clothing.getMinPrice()) {
            price += (Clothing.getMinPrice() - price);
        }
        this.price = price;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    public static double getTax() {
        return 0.2;
    }

    public static double getMinPrice() {
        return 10;
    }
    
    @Override
    public String toString()
    {
        return (this.getDescription() + " " + this.getPrice() + " " + this.getSize());
    }
    
    @Override
    public int compareTo(Clothing c)
    {
        return this.description.compareTo(c.description);
    }

}
