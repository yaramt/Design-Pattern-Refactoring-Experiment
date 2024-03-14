package org.ecommerce.mvc.view;

import org.ecommerce.mvc.Product;

import java.util.List;

public class ShoppingCartView {
    public void showProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}

