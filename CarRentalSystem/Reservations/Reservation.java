package Reservations;
import Payment.Payment;
import Users.User;
import Vehicle.Vehicle;

public class Reservation {
    Vehicle vch;
    User user;
    boolean isPaymentDone;
    Payment payment;
    ReservationStatus resType;

    // Constructor
    public Reservation(Vehicle vch,User user){
        resType=ReservationStatus.PROCESSING;
        this.vch=vch;
        this.user=user;
        this.isPaymentDone=false;
    }

    // make payment
    public void makePayment(Vehicle vch,int hours){
        this.payment=new Payment(vch.getDailyRentalCost(),hours);
        this.resType=ReservationStatus.COMPLETED;
        this.isPaymentDone=true;
    }

    // getter
    public int getVchID() {
        return vch.getVehicleID();
    }
}
