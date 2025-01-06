package Design.OrderManagementSystem;

import java.util.Map;

public class Order {
    private User user;
    private Address deliveryAddress;
    private Map<Integer, Integer> productCountMap;
    private WareHouse wareHouse;
    private Invoice invoice;
    private Payment payment;
    private OrderStatus orderStatus;

    public Order(User user, WareHouse wareHouse, PaymentMode mode) {
        this.user = user;
        this.productCountMap = user.getUserCartDetails().getCartMap();
        this.deliveryAddress = user.getAddress();
        this.wareHouse = wareHouse;
        this.payment = new Payment(mode);
        this.invoice = new Invoice();
    }

    public void checkout() {
        //1. make Payment
        boolean isPaymentSuccess = payment.makePayment();
        if (isPaymentSuccess) {
            //2. update inventory
            wareHouse.removeItemFromInventory(productCountMap);
            //3. Empty Cart
            user.getUserCartDetails().emptyCart();
            //4 Generate Invoice
            invoice.generateInvoice(this);
        }
    }


}
