package org.ecommerce.hmvc.mvcShoppingCart.view;

import org.ecommerce.hmvc.mvcProduct.model.ProductModel;

import java.util.List;

public class ShoppingCartView {
    public void displayCart(List<ProductModel> items) {
        System.out.println("Shopping Cart Items:");
        for (ProductModel item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}
