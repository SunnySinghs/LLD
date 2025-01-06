package Behavioral.Observer.Observables.Impl;

import Behavioral.Observer.Observables.StockObservables;
import Behavioral.Observer.Observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservablesImpl implements StockObservables {
    List<NotificationAlertObserver> list;
    int stockCount = 0;

    public IphoneObservablesImpl() {
        list = new ArrayList<>();
    }

    @Override
    public void register(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void deregister(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer: list) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if (this.stockCount == 0) {
            notifySubscribers();
        }
        this.stockCount += stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
