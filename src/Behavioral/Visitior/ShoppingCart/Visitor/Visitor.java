package Behavioral.Visitior.ShoppingCart.Visitor;

import Behavioral.Visitior.ShoppingCart.Element.Book;
import Behavioral.Visitior.ShoppingCart.Element.Electronic;

public interface Visitor {
    public void visit(Book book);
    public void visit(Electronic electronics);
}
