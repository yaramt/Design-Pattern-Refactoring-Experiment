package org.ecommerce.patternless;

public class Main {
    public static void main(String[] args) {
        String laptop = "Laptop - $999.99";
        String headphones = "Headphones - $49.99";

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(headphones);

        cart.showItems();
    }
}


