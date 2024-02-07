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
}

