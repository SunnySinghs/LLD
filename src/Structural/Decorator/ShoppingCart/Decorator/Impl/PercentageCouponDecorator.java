package Structural.Decorator.ShoppingCart.Decorator.Impl;

import Structural.Decorator.ShoppingCart.Product;
import Structural.Decorator.ShoppingCart.Decorator.CouponDecorator;

public class PercentageCouponDecorator extends CouponDecorator {

    public PercentageCouponDecorator(Product product, int percentageDiscount) {
        super(product, percentageDiscount);
    }

    @Override
    public double getPrice() {
        System.out.println("Percentage");
        double price = product.getPrice();
        return price - (price * percentageDiscount)/100;
    }
}
