package Tickets;

import java.time.LocalDate;

import ParkingManager.ParkingManager;
import Vehicle.Vehicle;

public class TwoWheelerTicket extends Tickets{
    public String type;

    public TwoWheelerTicket(int ticketId,
    LocalDate entryTime,
    LocalDate exitTime,Vehicle obj1,
    ParkingManager obj2){
        this.setType("Two Wheeler");
        this.setTicketId(ticketId);
        this.setExitTime(exitTime);
        this.setEntryTime(entryTime);
        this.setVehicleObj(obj1);
        this.setManagerObj(obj2);
    }
}
