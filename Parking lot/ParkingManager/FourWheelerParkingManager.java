package ParkingManager;

import Vehicle.FourWheeler;
import Vehicle.Vehicle;
import ParkingLot.ParkingLot;

public class FourWheelerParkingManager extends ParkingManager {

    public FourWheelerParkingManager(ParkingLot parkingLot) {
        super(parkingLot);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        if (vehicle instanceof FourWheeler && isParkingAvailable()) {
            // Add the four-wheeler to the parking lot
            parkingLot.addParkingSpace(vehicle.getParkingSpace());
            vehicles.add(vehicle);
            System.out.println("Four-wheeler " + vehicle.getPlateNo() + " parked.");
        } else {
            System.out.println("No available space or invalid vehicle type.");
        }
    }

    @Override
    public void removeVehicle(Vehicle vehicle) {
        if (vehicle instanceof FourWheeler && vehicles.contains(vehicle)) {
            // Remove the four-wheeler from the parking lot
            parkingLot.removeParkingSpace(vehicle.getParkingSpace());
            vehicles.remove(vehicle);
            System.out.println("Four-wheeler " + vehicle.getPlateNo() + " removed.");
        } else {
            System.out.println("Vehicle not found or incorrect vehicle type.");
        }
    }
}
