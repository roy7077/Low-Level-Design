package observer;
import observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    StockObservable obj;
    String phoneNo;
    public MobileAlertObserver(String phone,StockObservable ob)
    {
        obj=ob;
        phoneNo=phone;
    }

    public void update(){
        sendSms();
    }

    private void sendSms(){
        System.err.println("SMS sent to "+phoneNo);
    }
}
