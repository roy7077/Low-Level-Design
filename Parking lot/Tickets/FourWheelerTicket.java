package Tickets;

import java.time.LocalDate;
import ParkingManager.ParkingManager;
import Vehicle.Vehicle;

public class FourWheelerTicket extends Tickets{

    public FourWheelerTicket(int ticketId,
    LocalDate entryTime,
    LocalDate exitTime,Vehicle obj1,
    ParkingManager obj2){
        this.setType("Four Wheeler");
        this.setTicketId(ticketId);
        this.setExitTime(exitTime);
        this.setEntryTime(entryTime);
        this.setVehicleObj(obj1);
        this.setManagerObj(obj2);
    }
}
