package Structural.Facade.ProductOrder;

import Structural.Facade.ProductOrder.Facade.OrderFacade;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
