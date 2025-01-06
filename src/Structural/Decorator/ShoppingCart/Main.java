package Structural.Decorator.ShoppingCart;

import Structural.Decorator.ShoppingCart.Enum.ProductType;
import Structural.Decorator.ShoppingCart.Abstract.Impl.Item1;
import Structural.Decorator.ShoppingCart.Abstract.Impl.Item2;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("ABC", 1000, ProductType.FURNITURE_GOODS);
        Product item2 = new Item2("EFG", 2000, ProductType.ELECTRONIC_GOODS);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println(cart.getTotalAmount());
    }
}
