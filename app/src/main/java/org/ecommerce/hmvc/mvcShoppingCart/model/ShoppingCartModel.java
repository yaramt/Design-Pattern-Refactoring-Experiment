package org.ecommerce.hmvc.mvcShoppingCart.model;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {
    private List<ProductModel> items = new ArrayList<>();

    public void addItem(ProductModel product) {
        items.add(product);
    }

    public List<ProductModel> getItems() {
        return items;
    }
}

