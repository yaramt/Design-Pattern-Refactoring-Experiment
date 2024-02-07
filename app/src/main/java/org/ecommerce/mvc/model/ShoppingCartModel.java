package org.ecommerce.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {
    private List<String> items = new ArrayList<>();

    public void addItem(String product) {
        items.add(product);
    }

    public List<String> getItems() {
        return items;
    }
}




