package components;
import components.Enums.SeatCategory;

public class Seat {
    private int seatNumber;
    private SeatCategory seatCategory;
    private boolean isAvailable=true;

    public Seat(int seatNumber,SeatCategory seatCategory){
        this.seatCategory=seatCategory;
        this.seatNumber=seatNumber;
        this.isAvailable=true;
    }

    // getters
    public SeatCategory getSeatCategory() {
        return seatCategory;
    }


    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    // setters
    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
