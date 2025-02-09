package components;

import components.Enums.MovieGenre;

// Movie Class
public class Movie {
    private String movieName;
    private int movieRating; // Assuming rating is from 1-10
    private MovieGenre genre;
    private int movieLength;

    // Constructor
    public Movie(String movieName, int movieRating, MovieGenre genre) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.genre = genre;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getMovieLength() {
        return movieLength;
    }

    // Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public void setMovieRating(int movieRating) {
        if (movieRating >= 1 && movieRating <= 10) {
            this.movieRating = movieRating;
        } else {
            System.out.println("Invalid rating! Please enter a rating between 1 and 10.");
        }
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    // toString method for printing movie details
    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + movieName + '\'' +
                ", Rating=" + movieRating +
                ", Genre=" + genre +
                '}';
    }
}
