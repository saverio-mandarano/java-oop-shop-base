package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    public String name;
    public String description;
    public int code;
    public BigDecimal iva;
    public BigDecimal price;

    // Alla creazione di un nuovo prodotto, inizializzo il codice con un numero
    // intero random (compreso tra 0(incluso) e max (non incluso))
    public Product(String name, String description, BigDecimal iva, BigDecimal price) {
        Random r = new Random();
        int max = 10000000;
        this.code = r.nextInt(max);
        // System.out.println(this.code);

        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // metodo per ottenere il prezzo base del prodotto
    public BigDecimal getPrice() {
        return this.price;
    }

    // metodo per ottenere il prezzo comprensivo di iva del prodotto
    public BigDecimal getPricePlusIva() {
        // verificare se sono state inizializzate le varibaili di istanza
        if (price != null && iva != null) {
            return this.price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    // metodo per avere il nome esteso
    public String getSlug() {
        return this.name + "-" + this.code;
    }
}
