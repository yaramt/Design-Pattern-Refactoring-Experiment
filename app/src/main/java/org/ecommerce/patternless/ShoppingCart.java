package org.ecommerce.patternless;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<String> products = new ArrayList<>();

    public void addItem(String product) {
        products.add(product);
    }

    public void showItems() {
        for (String product : products) {
            System.out.println(product);
        }
    }

    public void removeItem(String product) {
         products.remove(product);
    }

    public List<String> getProducts() {
            return products;
    }

    public static void main(String[] args) {
        String laptop = "Laptop - $999.99";
        String headphones = "Headphones - $49.99";
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(headphones);
        cart.showItems();
    }
}



