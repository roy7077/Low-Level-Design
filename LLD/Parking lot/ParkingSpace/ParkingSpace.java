package ParkingSpace;

abstract public class ParkingSpace {
    public int fees;
    public int parkingId;
    public boolean status;

    public int getFees() {
        return fees;
    }

    public int getParkingId() {
        return parkingId;
    }

    public boolean isEmpty() {
        return !status;
    }

    public void releaseSpace() {
        status = false;
    }

    public void occupySpace() {
        status = true;
    }

    @Override
    public String toString() {
        return "ParkingSpace [ID=" + parkingId + ", Fees=" + fees + ", Status=" + (status ? "Occupied" : "Empty") + "]";
    }
}
