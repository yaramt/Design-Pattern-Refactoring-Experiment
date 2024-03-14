package org.ecommerce.mvc;

import org.ecommerce.mvc.controller.ShoppingCartController;
import org.ecommerce.mvc.model.ShoppingCartModel;
import org.ecommerce.mvc.view.ShoppingCartView;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Smartphone", 499.99);

        ShoppingCartModel cartModel = new ShoppingCartModel();
        ShoppingCartView cartView = new ShoppingCartView();
        ShoppingCartController cartController = new ShoppingCartController(cartModel, cartView);

        cartController.addProductToCartModel(product1);
        cartController.addProductToCartModel(product2);

        cartController.updateView();
    }
}



