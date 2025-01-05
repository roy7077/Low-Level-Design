package observable;
import observer.NotificationAlertObserver;

public interface StockObservable {
    void updateStock(int value);
    void addObserver(NotificationAlertObserver obj);
    void removeObserver(NotificationAlertObserver obj);
    void notifyObservers();
}