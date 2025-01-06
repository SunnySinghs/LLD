package Structural.Decorator.ShoppingCart.Abstract.Impl;

import Structural.Decorator.ShoppingCart.Product;
import Structural.Decorator.ShoppingCart.Enum.ProductType;

public class Item2 extends Product {
    public Item2(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {
        System.out.println("Item2");
        return originalPrice;
    }
}
