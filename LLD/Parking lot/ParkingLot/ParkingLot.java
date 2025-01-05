package ParkingLot;

import java.util.ArrayList;
import java.util.List;
import ParkingSpace.ParkingSpace;

public class ParkingLot {
    private List<ParkingSpace> availableSpaces = new ArrayList<>();
    private List<ParkingSpace> occupiedSpaces = new ArrayList<>();
    private int totalCapacity;

    public ParkingLot(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public void addParkingSpace(ParkingSpace space) {
        if (availableSpaces.size() + occupiedSpaces.size() >= totalCapacity) {
            throw new IllegalStateException("Parking lot is at full capacity.");
        }
        if (!availableSpaces.contains(space) && !occupiedSpaces.contains(space)) {
            availableSpaces.add(space);
        }
    }

    public void occupyParkingSpace(ParkingSpace space) {
        if (!availableSpaces.contains(space)) {
            throw new IllegalArgumentException("Parking space is not available.");
        }
        availableSpaces.remove(space);
        occupiedSpaces.add(space);
        //space.occupySpace();
    }

    public void releaseParkingSpace(ParkingSpace space) {
        if (!occupiedSpaces.contains(space)) {
            throw new IllegalArgumentException("Parking space is not occupied.");
        }
        occupiedSpaces.remove(space);
        availableSpaces.add(space);
        //space.releaseSpace();
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableSpaceCount() {
        return availableSpaces.size();
    }

    public int getOccupiedSpaceCount() {
        return occupiedSpaces.size();
    }

    @Override
    public String toString() {
        return "ParkingLot [Total Capacity=" + totalCapacity 
                + ", Available Spaces=" + getAvailableSpaceCount() 
                + ", Occupied Spaces=" + getOccupiedSpaceCount() + "]";
    }
}
