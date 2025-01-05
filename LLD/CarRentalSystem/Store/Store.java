package Store;
import Location.Location;
import Reservations.Reservation;
import Users.User;
import Vehicle.Status;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

import java.util.ArrayList;
import InventoryManagement.InvManagement;

public class Store {
    String storeName;
    int  storeId;
    Location location;
    InvManagement invMag;
    ArrayList<Reservation> Res;

    // Constructor
    public Store(String storeName,int storeId,Location location){
        invMag = new InvManagement();
        Res=new ArrayList<Reservation>();

        this.storeName=storeName;
        this.storeId=storeId;
        this.location=location;
    }

    // Methods
    public void addVehicle(Vehicle vch){
        invMag.addVehicle(vch);
    }

    public void removeVechicle(Vehicle vch){
        invMag.removeVechicle(vch);
    }

    public void makeReservation(User user,VehicleType type){

        Vehicle newVch=invMag.getActiveVehicle(type);

        if(newVch==null){
            System.out.println("No car Available");
            return ;
        }

        Reservation newRes=new Reservation(newVch,user);
        Res.add(newRes);
    }

    public void submitVehicle(Vehicle vch,int hours){
        invMag.ChangeStatus(vch.getVehicleID(),Status.ACTIVE);
        for (Reservation reservation : Res) {

            if(reservation.getVchID()==vch.getVehicleID())
            {
                reservation.makePayment(vch,hours);
                break;
            }
        }
    }

    public Location getLocation() {
        return location;
    }

    public String getStoreName() {
        return storeName;
    }
}
