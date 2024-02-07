package org.ecommerce.hmvc.mvcShoppingCart.view;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;
import org.ecommerce.hmvc.mvcProduct.view.ProductView;

import java.util.List;

public class ShoppingCartView {
    private ProductView productView = new ProductView();

    public void displayCart(List<ProductModel> items) {
        System.out.println("Shopping Cart Items:");
        for (ProductModel item : items) {
            productView.displayProduct(item);
        }
    }
}

