package Structural.Decorator.ShoppingCart;

import Structural.Decorator.ShoppingCart.Decorator.Impl.PercentageCouponDecorator;
import Structural.Decorator.ShoppingCart.Decorator.Impl.TypeCouponDecorator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount = new TypeCouponDecorator(new PercentageCouponDecorator(product, 10),
                5, product.getProductType());
        products.add(productWithEligibleDiscount);
    }

    public double getTotalAmount() {
        double price = 0;
        for (Product product: products) {
            price += product.getPrice();
        }
        return price;
    }


}
