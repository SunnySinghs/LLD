package Behavioral.Visitior.ShoppingCart.Element;

import Behavioral.Visitior.ShoppingCart.Visitor.Visitor;

public interface Item {
    public void accept(Visitor visitor);
}
