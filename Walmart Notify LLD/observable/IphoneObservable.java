package observable;
import java.util.ArrayList;
import observer.NotificationAlertObserver;

public class IphoneObservable implements StockObservable {
    ArrayList<NotificationAlertObserver>  ls=new ArrayList<NotificationAlertObserver>();
    int stock=0;
    public void addObserver(NotificationAlertObserver obj){
        ls.add(obj);
    }

    public void removeObserver(NotificationAlertObserver obj){
        ls.remove(obj);
    }

    public void updateStock(int value){
        if(stock==0)
        notifyObservers();

        stock+=value;
    }

    public void notifyObservers(){
        for (NotificationAlertObserver it : ls) {
            it.update();
        }
    }
}