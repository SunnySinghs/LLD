package Behavioral.Visitior.ShoppingCart;

import Behavioral.Visitior.ShoppingCart.Element.Book;
import Behavioral.Visitior.ShoppingCart.Element.Electronic;
import Behavioral.Visitior.ShoppingCart.Element.Item;
import Behavioral.Visitior.ShoppingCart.Visitor.Impl.DiscountVisitor;
import Behavioral.Visitior.ShoppingCart.Visitor.Impl.TotalCostVisitor;
import Behavioral.Visitior.ShoppingCart.Visitor.Visitor;

public class Main {
    public static void main(String[] args) {

        Visitor totalCostingVisitor = new TotalCostVisitor();

        Item item1 = new Book(100, "Five Point Someone");
        Item item2 = new Book(200, "Atomic Habits");
        Item item3 = new Electronic(300, "Iron");

        Item[] items = {item1, item2, item3};

        // Calculate total cost
        for (Item item: items) {
            item.accept(totalCostingVisitor);
        }
        System.out.println("Total Cost: $" + ((TotalCostVisitor)totalCostingVisitor).getTotalCost());

        // Apply discounts
        DiscountVisitor discountVisitor = new DiscountVisitor();
        for (Item item : items) {
            item.accept(discountVisitor);
        }
    }
}
