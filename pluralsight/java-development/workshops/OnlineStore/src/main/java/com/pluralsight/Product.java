package com.pluralsight;

/**
 * Simple data holder for a store item.
 * <p>
 * Fields
 * • id    - string code the user types (for example “A17”)
 * • name  - product title
 * • price - selling price
 * <p>
 * The fields are final because the program never changes them after
 * loading the inventory.
 */
public class Product {

    private final String id;
    private final String name;
    private final double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /* Getters (read-only access) */

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
