package org.ecommerce.hmvc.mvcProduct.controller;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.hmvc.mvcProduct.view.ProductView;

public class ProductController {
    private ProductModel model;
    private ProductView view;

    public ProductController(ProductModel model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void displayProduct() {
        view.displayProduct(model);
    }
}
