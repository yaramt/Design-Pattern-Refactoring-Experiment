package org.ecommerce.hmvc.mvcShoppingCart.model;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {
    private List<ProductModel> products = new ArrayList<>();

    public void addProduct(ProductModel product) {
        products.add(product);
    }

    public List<ProductModel> getProducts() {
        return products;
    }
}

