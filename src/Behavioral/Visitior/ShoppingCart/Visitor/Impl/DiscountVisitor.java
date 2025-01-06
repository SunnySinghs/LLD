package Behavioral.Visitior.ShoppingCart.Visitor.Impl;

import Behavioral.Visitior.ShoppingCart.Element.Book;
import Behavioral.Visitior.ShoppingCart.Element.Electronic;
import Behavioral.Visitior.ShoppingCart.Visitor.Visitor;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Applying 10% discount on Book: " + book.getName());
    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println("Applying 5% discount on Electronic: " + electronic.getName());
    }
}
