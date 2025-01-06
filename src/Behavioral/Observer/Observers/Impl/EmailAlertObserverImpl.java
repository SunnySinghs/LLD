package Behavioral.Observer.Observers.Impl;

import Behavioral.Observer.Observables.StockObservables;
import Behavioral.Observer.Observers.NotificationAlertObserver;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    StockObservables stockObservables;
    String email;
    public EmailAlertObserverImpl(StockObservables stockObservables, String email) {
        this.stockObservables = stockObservables;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail(email, "Product is in stock. Hurry..."+stockObservables.getStockCount());
    }

    private void sendEmail(String email, String s) {
        System.out.println("Mail send to "+ email);
    }
}
