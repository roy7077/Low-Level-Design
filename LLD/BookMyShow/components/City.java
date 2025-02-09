package components;

import java.util.ArrayList;
import java.util.HashSet;

public class City {
    private String cityName;
    private HashSet<Movie> movies = new HashSet<>();
    private HashSet<Theater> theaters = new HashSet<>();

    // Constructor
    public City(String cityName, HashSet<Movie> movies, HashSet<Theater> theaters) {
        this.cityName = cityName;
        this.movies = movies;
        this.theaters = theaters;
    }

    // Get all shows for a theater
    public HashSet<Show> getAllShowsForTheater(Theater theater) {
        if (theaters.contains(theater)) {
            return theater.getAllShows();
        }
        System.out.println("No such theater found in this city.");
        return new HashSet<>();
    }

    // Get all movies of a theater
    public HashSet<Movie> getAllMoviesOfTheater(Theater theater) {
        if (theaters.contains(theater)) {
            return theater.getAllMovies();
        }
        System.out.println("No such theater found in this city.");
        return new HashSet<>();
    }

    // Get all shows for a movie
    public ArrayList<Show> getShowsForMovie(Movie movie) {
        ArrayList<Show> movieShows = new ArrayList<>();
        for (Theater theater : theaters) {
            if (theater.isMovieExist(movie)) {
                movieShows.addAll(theater.getAllShowsOfMovie(movie));
            }
        }
        return movieShows;
    }

    // Get all movies in a city
    public HashSet<Movie> getAllMoviesInCity() {
        return movies;
    }

    // Get all theaters in a city
    public HashSet<Theater> getAllTheatersInCity() {
        return theaters;
    }

    // Getters
    public String getCityName() {
        return cityName;
    }

    // Setters
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void addTheater(Theater theater) {
        this.theaters.add(theater);
    }
}


/**
 * Get all shows for a theater
 * Get all movies of a theater
 * 
 * Get shows for a movie
 * Get all movies in a city
 * get all theaters in a city
 */