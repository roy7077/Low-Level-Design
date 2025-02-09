package components;

import java.util.ArrayList;
import java.util.HashSet;

public class Theater {
    private HashSet<Movie> movies = new HashSet<>();
    private HashSet<Show> shows = new HashSet<>();
    private Location location;
    private String theaterName;

    // Constructor
    public Theater(String theaterName, Location location, HashSet<Movie> movies, HashSet<Show> shows) {
        this.movies = movies;
        this.shows = shows;
        this.location = location;
        this.theaterName = theaterName;
    }

    // Check if a movie exists
    public boolean isMovieExist(Movie movie) {
        return movies.contains(movie);
    }

    // Getters
    public Location getLocation() {
        return location;
    }

    public HashSet<Show> getAllShows() {
        return shows;
    }

    public HashSet<Movie> getAllMovies() {
        return movies;
    }

    public String getTheaterName() {
        return theaterName;
    }

    // Get all shows of a specific movie
    public ArrayList<Show> getAllShowsOfMovie(Movie movie) {
        ArrayList<Show> tempShows = new ArrayList<>();

        if (!movies.contains(movie)) {
            System.out.println("There is no such movie.");
            return tempShows; // Return empty list instead of null
        }

        for (Show show : shows) {
            if (show.getMovie().equals(movie)) {
                tempShows.add(show);
            }
        }
        return tempShows;
    }

    // Add a movie
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    // Add a show
    public void addShow(Show show) {
        this.shows.add(show);
    }

    // Setters
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
}
