package Behavioral.Observer.Observers.Impl;

import Behavioral.Observer.Observables.StockObservables;
import Behavioral.Observer.Observers.NotificationAlertObserver;

public class MobileObserverImpl implements NotificationAlertObserver {
    StockObservables stockObservables;
    String mobile;
    public MobileObserverImpl(StockObservables stockObservables, String mobile) {
        this.stockObservables = stockObservables;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        sendMsg(mobile, "Product is in stock. Hurry..."+stockObservables.getStockCount());
    }

    private void sendMsg(String mobile, String s) {
        System.out.println("Msg send to "+ mobile);
    }
}
