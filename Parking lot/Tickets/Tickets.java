package Tickets;

import java.time.LocalDate;

import ParkingManager.ParkingManager;
import Vehicle.Vehicle;

abstract public class Tickets {
    private String type;
    private int ticketId;
    private Vehicle vehicleObj;
    private ParkingManager managerObj;
    private LocalDate EntryTime;
    private LocalDate ExitTime;

    // getter
    public LocalDate getEntryTime() {
        return EntryTime;
    }

    public LocalDate getExitTime() {
        return ExitTime;
    }

    public ParkingManager getManagerObj() {
        return managerObj;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicleObj() {
        return vehicleObj;
    }

    public String getType() {
        return type;
    }

    
    // setter
    public void setType(String type) {
        this.type = type;
    }

    public void setEntryTime(LocalDate entryTime) {
        EntryTime = entryTime;
    }

    public void setExitTime(LocalDate exitTime) {
        ExitTime = exitTime;
    }

    public void setManagerObj(ParkingManager managerObj) {
        this.managerObj = managerObj;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setVehicleObj(Vehicle vehicleObj) {
        this.vehicleObj = vehicleObj;
    }
}
