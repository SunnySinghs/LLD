package Behavioral.Observer;

import Behavioral.Observer.Observables.Impl.IphoneObservablesImpl;
import Behavioral.Observer.Observables.StockObservables;
import Behavioral.Observer.Observers.Impl.EmailAlertObserverImpl;
import Behavioral.Observer.Observers.Impl.MobileObserverImpl;
import Behavioral.Observer.Observers.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservables stockObservables = new IphoneObservablesImpl();

        NotificationAlertObserver emailObserver1 = new EmailAlertObserverImpl(stockObservables, "a.a@a.com");
        NotificationAlertObserver emailObserver2 = new EmailAlertObserverImpl(stockObservables, "b.b@b.com");
        NotificationAlertObserver msgObserver = new MobileObserverImpl(stockObservables, "9876543210");

        stockObservables.register(emailObserver1);
        stockObservables.register(emailObserver2);
        stockObservables.register(msgObserver);

        stockObservables.setStockCount(10);

    }
}
