package org.ecommerce.hmvc.mvcProduct.view;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;

public class ProductView {
    public void displayProduct(ProductModel product) {
        System.out.println("Product Information:");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
    }
}
