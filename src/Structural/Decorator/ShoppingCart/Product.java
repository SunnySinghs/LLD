package Structural.Decorator.ShoppingCart;

import Structural.Decorator.ShoppingCart.Enum.ProductType;

public abstract class Product {
    String name;
    protected double originalPrice;
    ProductType productType;

    public Product(){}

    public Product(String name, double originalPrice, ProductType productType) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();


    public ProductType getProductType() {
        return productType;
    }
}
