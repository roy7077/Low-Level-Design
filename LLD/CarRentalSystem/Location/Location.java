package Location;

public class Location {
    String Country;
    String State;
    String City;
    String Area;
    int Pincode;

    // Constructor
    public Location(String Country,String State,String City,String Area,int Pincode){
        this.Country=Country;
        this.Area=Area;
        this.City=City;
        this.Pincode=Pincode;
        this.State=State;
    }

    // getter
    public String getArea() {
        return Area;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public int getPincode() {
        return Pincode;
    }

    public String getState() {
        return State;
    }
}
