package org.ecommerce.hmvc.mvcShoppingCart.model;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.mvc.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {
    private List<ProductModel> products;

    public ShoppingCartModel() {
        products = new ArrayList<>();
    }

    public void addProduct(ProductModel product) {
        products.add(product);
    }

    public void removeProduct(ProductModel product) {
        products.remove(product);
    }

    public List<ProductModel> getProducts() {
        return products;
    }
}

