/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ShopApp;

import java.util.Arrays;

/**
 *
 * @author Vinscasss
 */
public class ShopApp {

    public static void main(String[] args) {
        int measurement = 2;
        System.out.println(Clothing.getMinPrice());
        System.out.println(Clothing.getTax());
        Customer c1 = new Customer("Pinky",3);
         
        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",10.5,"S");
        Clothing item3 = new Clothing("Green Scarf",5,"L");
        Clothing item4 = new Clothing("Blue T-Shirt",10.5,"S");
        Clothing[] items = {item1, item2, item3 , item4};

        c1.setSize(measurement);
        System.out.println(c1.toString());
        
        c1.addItems(items);
        System.out.println(c1.getTotalClothingCost());
        c1.avgPrice("L");
        
        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems())
        {
            System.out.println("Item Output: " + item );
        }


    }
}
