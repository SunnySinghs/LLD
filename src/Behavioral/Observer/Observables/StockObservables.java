package Behavioral.Observer.Observables;

import Behavioral.Observer.Observers.NotificationAlertObserver;

public interface StockObservables {
    public void register(NotificationAlertObserver observer);
    public void deregister(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int stockCount);
    public int getStockCount();
}
