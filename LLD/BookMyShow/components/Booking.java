package components;
import java.util.List;


public class Booking {
    private User user;
    private List<Seat> seats;
    private Show show;
    private int amount;

    // Constructor
    public Booking(User user, List<Seat> seats,Show show) {
        this.user = user;
        this.seats = seats;
        this.show = show;
        bookSeat(seats);
    }

    // Booking logic
    private void bookSeat(List<Seat> seats) {
        amount = 0;
        for (Seat seat : seats) {
            amount += show.getSeatPrice(seat);
        }
        System.out.println("Ticket amount is: " + amount);
    }

    // Getters
    public User getUser() {
        return user;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public int getAmount() {
        return amount;
    }

    public Show getShow() {
        return show;
    }
}
