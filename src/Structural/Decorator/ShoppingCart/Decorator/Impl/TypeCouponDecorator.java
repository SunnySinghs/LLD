package Structural.Decorator.ShoppingCart.Decorator.Impl;

import Structural.Decorator.ShoppingCart.Product;
import Structural.Decorator.ShoppingCart.Decorator.CouponDecorator;
import Structural.Decorator.ShoppingCart.Enum.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {
    ProductType type;

    static List<ProductType> types = new ArrayList<>();
    static {
        types.add(ProductType.FURNITURE_GOODS);
        types.add(ProductType.DECORATIVE_GOODS);
    }

    public TypeCouponDecorator(Product product, int percentageDiscount, ProductType type) {
        super(product, percentageDiscount);
        this.type = type;
    }

    @Override
    public double getPrice() {
        System.out.println("Type");
        double price = product.getPrice();
        if (types.contains(type)) {
            return price - (price * percentageDiscount) / 100;
        }
        return price;
    }
}
