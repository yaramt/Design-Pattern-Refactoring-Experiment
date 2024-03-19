package org.ecommerce.hmvc.mvcProduct.controller;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.hmvc.mvcProduct.view.ProductView;

public class ProductController {
    private ProductModel productModel;
    private ProductView productView;

    public ProductController(ProductModel productModel, ProductView productView) {
        this.productModel = productModel;
        this.productView = productView;
    }

    public void displayProduct() {
        productView.displayProduct(productModel);
    }
}