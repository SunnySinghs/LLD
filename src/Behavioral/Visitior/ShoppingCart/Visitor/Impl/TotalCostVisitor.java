package Behavioral.Visitior.ShoppingCart.Visitor.Impl;

import Behavioral.Visitior.ShoppingCart.Element.Book;
import Behavioral.Visitior.ShoppingCart.Element.Electronic;
import Behavioral.Visitior.ShoppingCart.Visitor.Visitor;

public class TotalCostVisitor implements Visitor {
    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(Book book) {
        totalCost += book.getPrice();
    }

    @Override
    public void visit(Electronic electronics) {
        totalCost += electronics.getPrice();
    }
}
