package org.ecommerce.mvc.view;

import java.util.List;

public class ShoppingCartView {
    public void showItems(List<String> items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}

