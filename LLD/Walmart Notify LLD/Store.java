import observable.IphoneObservable;
import observable.StockObservable;
import observer.EmailAlertObserver;
import observer.MobileAlertObserver;
import observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable st=new IphoneObservable();
        NotificationAlertObserver user1=new EmailAlertObserver("Raysagar807@gmail.com",st);
        NotificationAlertObserver user2=new MobileAlertObserver("8728853554", st);

        st.addObserver(user1);
        st.addObserver(user2);

        st.updateStock(2);
    }
}
