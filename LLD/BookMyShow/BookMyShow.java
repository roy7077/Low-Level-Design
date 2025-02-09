import java.util.ArrayList;
import java.util.HashSet;

import components.City;
import components.Movie;
import components.Show;

public class BookMyShow {
    private HashSet<City> cities = new HashSet<>();

    // Constructor
    public BookMyShow(HashSet<City> cities) {
        this.cities = cities;
    }

    // Get all shows for a movie in a particular city
    public ArrayList<Show> getAllShowsForAMovie(City city, Movie movie) {
        if (!cities.contains(city)) {
            System.out.println("There is no city with this name.");
            return new ArrayList<>();
        }

        for (City c : cities) {
            if (c.equals(city)) {
                return c.getShowsForMovie(movie);
            }
        }
        return new ArrayList<>();
    }

    // Get all movies for a city
    public HashSet<Movie> getAllMoviesForACity(City city) {
        if (!cities.contains(city)) {
            System.out.println("There is no city with this name.");
            return new HashSet<>();
        }

        for (City c : cities) {
            if (c.equals(city)) {
                return c.getAllMoviesInCity();
            }
        }
        return new HashSet<>();
    }

    // Add a new city
    public void addCity(City city) {
        cities.add(city);
    }

    // Get all cities in BookMyShow
    public HashSet<City> getAllCities() {
        return cities;
    }
}
