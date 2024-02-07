package org.ecommerce.mvc;

import org.ecommerce.mvc.controller.ShoppingCartController;
import org.ecommerce.mvc.model.ShoppingCartModel;
import org.ecommerce.mvc.view.ShoppingCartView;

public class Main {
    public static void main(String[] args) {
        String laptop = "Laptop - $999.99";
        String headphones = "Headphones - $49.99";

        ShoppingCartModel cartModel = new ShoppingCartModel();
        ShoppingCartView cartView = new ShoppingCartView();
        ShoppingCartController cartController = new ShoppingCartController(cartModel, cartView);

        cartController.addItem(laptop);
        cartController.addItem(headphones);

        cartController.showItems();
    }
}



