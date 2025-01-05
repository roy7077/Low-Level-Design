package ParkingManager;

import Vehicle.TwoWheeler;
import Vehicle.Vehicle;
import ParkingLot.ParkingLot;

public class TwoWheelerParkingManager extends ParkingManager {

    public TwoWheelerParkingManager(ParkingLot parkingLot) {
        super(parkingLot);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        if (vehicle instanceof TwoWheeler && isParkingAvailable()) {
            // Add the two-wheeler to the parking lot
            parkingLot.addParkingSpace(vehicle.getParkingSpace());
            vehicles.add(vehicle);
            System.out.println("Two-wheeler " + vehicle.getVehicleNumber() + " parked.");
        } else {
            System.out.println("No available space or invalid vehicle type.");
        }
    }

    @Override
    public void removeVehicle(Vehicle vehicle) {
        if (vehicle instanceof TwoWheeler && vehicles.contains(vehicle)) {
            // Remove the two-wheeler from the parking lot
            parkingLot.removeParkingSpace(vehicle.getParkingSpace());
            vehicles.remove(vehicle);
            System.out.println("Two-wheeler " + vehicle.getVehicleNumber() + " removed.");
        } else {
            System.out.println("Vehicle not found or incorrect vehicle type.");
        }
    }
}
