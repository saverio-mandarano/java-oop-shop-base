package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        String description = "Figurina del cane di Paperino";
        BigDecimal iva = new BigDecimal(0.22);
        BigDecimal price = new BigDecimal(100.015);

        Product pluto = new Product("pluto", "Nike", description, iva, price);

        // getter
        System.out.println("name = " + pluto.getName());
        System.out.println("code = " + pluto.getCode());
        System.out.println("slug = " + pluto.getSlug());
        System.out.println("description = " + pluto.getDescription());
        System.out.println("brand = " + pluto.getBrand());
        System.out.println("iva = " + pluto.getIva());
        System.out.println("price = " + pluto.getPrice());
        System.out.println("price with iva = " + pluto.getPricePlusIva());

        // setter

    }

}
