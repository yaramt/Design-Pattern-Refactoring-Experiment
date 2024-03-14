package org.ecommerce.mvc;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public double setPrice(double price) {
        return this.price = price;
    }
}
