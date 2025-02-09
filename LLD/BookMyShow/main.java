import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import components.Booking;
import components.City;
import components.Location;
import components.Movie;
import components.Screen;
import components.Seat;
import components.SeatPriceClass;
import components.Show;
import components.Theater;
import components.User;
import components.Enums.MovieGenre;

public class main {
    public static void main(String[] args) {
        // Create a sample BookMyShow system
        BookMyShow bookMyShow = setupBookMyShow();

        // Test Case 1: Book a ticket for a valid show and available seats
        testBookingSuccess(bookMyShow);

        // Test Case 2: Try booking unavailable seats
        testBookingFailure(bookMyShow);
    }

    private static BookMyShow setupBookMyShow() {
        // Create movie
        Movie movie1 = new Movie("Inception", 150);

        // Create seat pricing
        SeatPriceClass seatPrice = new SeatPriceClass();
        
        // Create screen and seats
        Screen screen1 = new Screen(1, 10); // 10 seats in Screen 1

        // Create show
        Show show1 = new Show(movie1, new Time(18, 30), screen1, seatPrice);

        // Create theater and add show
        Theater theater1 = new Theater("PVR Cinemas", new Location("Mumbai", "Maharashtra", "India"));
        theater1.addShow(show1);
        theater1.addMovie(movie1);

        // Create city and add theater
        City city1 = new City("Mumbai", new HashSet<>(Arrays.asList(movie1)), new HashSet<>(Arrays.asList(theater1)));

        // Create BookMyShow instance and add city
        BookMyShow bookMyShow = new BookMyShow(new HashSet<>(Arrays.asList(city1)));

        return bookMyShow;
    }

    private static void testBookingSuccess(BookMyShow bookMyShow) {
        System.out.println("\n--- Test Case 1: Successful Booking ---");
        
        // Get Mumbai city and Inception movie
        City city = findCity(bookMyShow, "Mumbai");
        Movie movie = findMovie(city, "Inception");

        if (city == null || movie == null) {
            System.out.println("Test failed: City or Movie not found.");
            return;
        }

        // Get available shows for the movie
        ArrayList<Show> shows = bookMyShow.getAllShowsForAMovie(city, movie);
        if (shows.isEmpty()) {
            System.out.println("Test failed: No shows available.");
            return;
        }

        Show show = shows.get(0);
        
        // Create a user
        User user = new User("John Doe", "john@example.com");

        // Select seats to book
        List<Seat> seatsToBook = show.getAvailableSeats().subList(0, 2); // Booking first 2 seats

        // Book tickets
        Booking booking = show.bookSeat(user, seatsToBook);

        // Verify booking details
        if (booking != null) {
            System.out.println("Booking successful! Amount: " + booking.getAmount());
        } else {
            System.out.println("Test failed: Booking failed.");
        }
    }

    private static void testBookingFailure(BookMyShow bookMyShow) {
        System.out.println("\n--- Test Case 2: Booking Unavailable Seats ---");
        
        City city = findCity(bookMyShow, "Mumbai");
        Movie movie = findMovie(city, "Inception");

        if (city == null || movie == null) {
            System.out.println("Test failed: City or Movie not found.");
            return;
        }

        ArrayList<Show> shows = bookMyShow.getAllShowsForAMovie(city, movie);
        if (shows.isEmpty()) {
            System.out.println("Test failed: No shows available.");
            return;
        }

        Show show = shows.get(0);
        
        // Create another user
        User user = new User("Jane Doe", "jane@example.com");

        // Try to book the same seats again (already booked in test 1)
        List<Seat> seatsToBook = show.getAvailableSeats().subList(0, 2); 

        Booking booking = show.bookSeat(user, seatsToBook);

        if (booking == null) {
            System.out.println("Booking failed as expected! Seats were already booked.");
        } else {
            System.out.println("Test failed: Seats should have been unavailable.");
        }
    }

    private static City findCity(BookMyShow bookMyShow, String cityName) {
        for (City city : bookMyShow.getAllCities()) {
            if (city.getCityName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null;
    }

    private static Movie findMovie(City city, String movieName) {
        for (Movie movie : city.getAllMoviesInCity()) {
            if (movie.getTitle().equalsIgnoreCase(movieName)) {
                return movie;
            }
        }
        return null;
    }
}
