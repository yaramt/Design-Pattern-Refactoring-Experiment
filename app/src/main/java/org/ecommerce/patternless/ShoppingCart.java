package org.ecommerce.patternless;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    List<String> items = new ArrayList<>();
    public void addItem(String product) {
        items.add(product);
    }
    public void showItems() {
        for (String item : items) {
            System.out.println(item);
        }
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

