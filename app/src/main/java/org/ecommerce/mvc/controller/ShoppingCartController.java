package org.ecommerce.mvc.controller;

import org.ecommerce.mvc.Product;
import org.ecommerce.mvc.model.ShoppingCartModel;
import org.ecommerce.mvc.view.ShoppingCartView;

public class ShoppingCartController {
    private ShoppingCartModel cartModel;
    private ShoppingCartView cartView;

    public ShoppingCartController(ShoppingCartModel cartModel, ShoppingCartView cartView) {
        this.cartModel = cartModel;
        this.cartView = cartView;
    }

    public void addProductToCartModel(Product product) {
        cartModel.addProduct(product);
    }

    public void removeProductFromCartModel(Product product) {
        cartModel.removeProduct(product);
    }

    public void updateView() {
        cartView.showProducts(cartModel.getProducts());
    }
}




