package org.ecommerce.mvc.controller;

import org.ecommerce.mvc.model.ShoppingCartModel;
import org.ecommerce.mvc.view.ShoppingCartView;

import java.util.List;

public class ShoppingCartController {
    private ShoppingCartModel model;
    private ShoppingCartView view;

    public ShoppingCartController(ShoppingCartModel model, ShoppingCartView view) {
        this.model = model;
        this.view = view;
    }

    public void addItem(String product) {
        model.addItem(product);
    }

    public void showItems() {
        List<String> items = model.getItems();
        view.showItems(items);
    }
}




