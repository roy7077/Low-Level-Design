package components;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private ArrayList<Seat> seats;
    private int screenHeight;
    private int screenWidth;
    private String screenName;

    public Screen(ArrayList<Seat> seats, String screenName, int screenHeight, int screenWidth) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.screenName = screenName;
        this.seats = seats;
    }

    // Get available seats
    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (!seat.isAvailable()) { // Assuming Seat has isBooked()
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    // Getters
    public int getScreenHeight() {
        return screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public String getScreenName() {
        return screenName;
    }

    // Setters
    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Booking bookSeats(User user,List<Seat> seatsToBook,Show show) {
        for(Seat seat:this.seats){
            if(!seat.isAvailable()){
                System.out.println(seat.getSeatNumber()+" This seat is not Available");
                return null;
            }
        }

        for (Seat seat : seatsToBook)
        seat.setAvailable(false);

        return new Booking(user, seatsToBook, show);
    }
    
}
