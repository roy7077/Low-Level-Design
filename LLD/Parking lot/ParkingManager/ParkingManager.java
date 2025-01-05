package ParkingManager;

import java.util.ArrayList;
import ParkingLot.ParkingLot;
import Vehicle.Vehicle;

abstract public class ParkingManager {
    protected ArrayList<Vehicle> vehicles = new ArrayList<>();
    protected ParkingLot parkingLot;

    public ParkingManager(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public abstract void addVehicle(Vehicle vehicle);

    public abstract void removeVehicle(Vehicle vehicle);

    public boolean isParkingAvailable() {
        // Returns true if there is space available in the parking lot
        return parkingLot.getAvailableSpaceCount() > 0;
    }

    public boolean isParkingFull() {
        // Returns true if parking lot is full
        return parkingLot.getAvailableSpaceCount() == 0;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}


