package components;

public class Location {
    private String city;
    private String state;
    private String country;

    // Constructor
    public Location(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Getters
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    // Setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Convert to String (formatted output)
    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }

    // Check if two locations are the same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return city.equals(location.city) && 
               state.equals(location.state) && 
               country.equals(location.country);
    }

    // HashCode for use in HashSet/HashMap
    @Override
    public int hashCode() {
        return city.hashCode() + state.hashCode() + country.hashCode();
    }
}
