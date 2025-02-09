package components;
import java.util.List;
import components.Enums.SeatCategory;

public class Show {
    private Movie movie;
    private Time time;
    private Screen screen;
    SeatPriceClass seatPrice;
    public Show(Movie movie,Time time,Screen screen,SeatPriceClass seatPrice){
        this.movie=movie;
        this.time=time;
        this.screen=screen;
        this.seatPrice=seatPrice;
    }

    // getters
    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public Time getTime() {
        return time;
    }

    public int getSeatPrice(Seat seat) {
        return seatPrice.getSeatPrice(seat.getSeatCategory());
    }

    public List<Seat> getAvailableSeats(){
        return screen.getAvailableSeats();
    }

    // setter

    public Booking bookSeat(User user,List<Seat> seats){
        return this.screen.bookSeats(user, seats,this);
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setSeatPrice(SeatCategory seat,int seatPrice) {
        this.seatPrice.setSeatPrice(seat, seatPrice);
    }
}
