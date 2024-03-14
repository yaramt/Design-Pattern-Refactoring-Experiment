package org.ecommerce.mvc.model;

import org.ecommerce.mvc.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {
    private List<Product> products;

    public ShoppingCartModel() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

}




