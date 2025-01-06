package Structural.Decorator.ShoppingCart.Abstract.Impl;

import Structural.Decorator.ShoppingCart.Product;
import Structural.Decorator.ShoppingCart.Enum.ProductType;

public class Item1 extends Product {
    public Item1(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {
        System.out.println("Item1");
        return originalPrice;
    }
}
