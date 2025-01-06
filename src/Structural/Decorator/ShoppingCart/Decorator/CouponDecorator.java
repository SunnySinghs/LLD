package Structural.Decorator.ShoppingCart.Decorator;

import Structural.Decorator.ShoppingCart.Product;

public abstract class CouponDecorator extends Product {
    protected Product product;
    protected int percentageDiscount;

    public CouponDecorator(Product product, int percentageDiscount) {
        this.product = product;
        this.percentageDiscount = percentageDiscount;
    }


}
