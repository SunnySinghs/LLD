package Behavioral.Visitior.ShoppingCart.Element;

import Behavioral.Visitior.ShoppingCart.Visitor.Visitor;

public class Book implements Item{
    private double price;
    private String name;

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
