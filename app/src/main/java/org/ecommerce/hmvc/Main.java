package org.ecommerce.hmvc;

import org.ecommerce.hmvc.mvcProduct.controller.ProductController;
import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.hmvc.mvcProduct.view.ProductView;
import org.ecommerce.hmvc.mvcShoppingCart.controller.ShoppingCartController;
import org.ecommerce.hmvc.mvcShoppingCart.model.ShoppingCartModel;
import org.ecommerce.hmvc.mvcShoppingCart.view.ShoppingCartView;

public class Main {
    public static void main(String[] args) {
        // Create Product
        ProductModel laptop = new ProductModel("Laptop", 999.99);
        ProductModel headphones = new ProductModel("Headphones", 49.99);

        // Create Product View and Controller
        ProductView productView = new ProductView();
        ProductController productController1 = new ProductController(laptop, productView);
        ProductController productController2 = new ProductController(headphones, productView);

        // Create ShoppingCart
        ShoppingCartModel cartModel = new ShoppingCartModel();
        ShoppingCartView cartView = new ShoppingCartView();
        ShoppingCartController cartController = new ShoppingCartController(cartModel, cartView);

        // Add products to ShoppingCart
        cartController.addProduct(laptop);
        cartController.addProduct(headphones);

        // Show items in ShoppingCart
        cartController.showProducts();
    }
}
