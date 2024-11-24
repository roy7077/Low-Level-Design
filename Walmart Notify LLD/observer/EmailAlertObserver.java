package observer;

import observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    StockObservable obj;
    String emailId;
    public EmailAlertObserver(String email,StockObservable ob)
    {
        obj=ob;
        emailId=email;
    }

    public void update(){
        sendEmail();
    }

    private void sendEmail(){
        System.err.println("Email sent to "+emailId);
    }
}
