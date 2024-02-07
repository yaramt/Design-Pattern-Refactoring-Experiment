package org.ecommerce.hmvc.mvcShoppingCart.controller;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.hmvc.mvcShoppingCart.model.ShoppingCartModel;
import org.ecommerce.hmvc.mvcShoppingCart.view.ShoppingCartView;

import java.util.List;

public class ShoppingCartController {
    private ShoppingCartModel model;
    private ShoppingCartView view;

    public ShoppingCartController(ShoppingCartModel model, ShoppingCartView view) {
        this.model = model;
        this.view = view;
    }

    public void addItem(ProductModel product) {
        model.addItem(product);
    }

    public void showItems() {
        List<ProductModel> items = model.getItems();
        view.displayCart(items);
    }
}
