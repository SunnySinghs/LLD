package Structural.Facade.ProductOrder.Facade;

import Structural.Facade.ProductOrder.Dao.ProductDao;
import Structural.Facade.ProductOrder.Impl.Invoice;
import Structural.Facade.ProductOrder.Impl.Notification;
import Structural.Facade.ProductOrder.Impl.Payment;

public class OrderFacade {
    ProductDao productDao;
    Payment payment;
    Invoice invoice;
    Notification notification;

    public OrderFacade() {
        this.productDao = new ProductDao();
        this.payment = new Payment();
        this.invoice = new Invoice();
        this.notification = new Notification();
    }

    public void createOrder() {
        productDao.getProduct(1);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
