package org.lessons.java.shop;

import java.util.Random;

public class Product {
    public String name;
    public String description;
    public int code;
    public double iva;
    public double price;

    Product() {
        Random r = new Random();
        int max = 100;
        this.code = r.nextInt(max);
        // System.out.println(this.code);
    }
}
