package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // String name = "pluto";
        String description = "Figurina del cane di Paperino";
        BigDecimal iva = new BigDecimal(0.22);
        BigDecimal price = new BigDecimal(100);

        Product pluto = new Product("pluto", description, iva, price);

        System.out.println("price = " + pluto.getPrice());
        System.out.println("price with iva = " + pluto.getPricePlusIva());
        System.err.println(pluto.getSlug());

    }
}
