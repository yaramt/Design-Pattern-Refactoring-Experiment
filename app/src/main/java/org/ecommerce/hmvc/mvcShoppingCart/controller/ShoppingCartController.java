package org.ecommerce.hmvc.mvcShoppingCart.controller;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.hmvc.mvcShoppingCart.model.ShoppingCartModel;
import org.ecommerce.hmvc.mvcShoppingCart.view.ShoppingCartView;


public class ShoppingCartController {
    private ShoppingCartModel cartModel;
    private ShoppingCartView cartView;

    public ShoppingCartController(ShoppingCartModel cartModel, ShoppingCartView cartView) {
        this.cartModel = cartModel;
        this.cartView = cartView;
    }

    public void addProductToCart(ProductModel product) {
        cartModel.addProduct(product);
    }

    public void removeProductFromCart(ProductModel product) {
        cartModel.removeProduct(product);
    }

    public void updateView() {
        cartView.displayCart(cartModel.getProducts());
    }
}

