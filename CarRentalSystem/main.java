
import java.sql.Date;

import CarRentalSystem.CarRentalSystem;
import Location.Location;
import Store.Store;
import Users.User;
import Vehicle.Car;
import Vehicle.Status;
import Vehicle.VehicleType;

public class main {
    public static void main(String[] args) {

        // Create Car Rental System
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        // Create Locations
        Location loc1 = new Location("India", "Punjab", "Chandigarh", "Sector 22", 160022);
        Location loc2 = new Location("India", "Haryana", "Panchkula", "Sector 5", 134108);

        // Create Stores
        Store store1 = new Store("City Motors", 1, loc1);
        Store store2 = new Store("Metro Rentals", 2, loc2);

        // Add Stores to Car Rental System
        carRentalSystem.addStore(store1);
        carRentalSystem.addStore(store2);

        // Create Users
        User user1 = new User("Sagar ray", "21", "11222334455", "DL12345");
        User user2 = new User("Sonu Smith", "24", "11223354646", "DL67890");

        // Add Users to Car Rental System
        carRentalSystem.addUser(user1);
        carRentalSystem.addUser(user2);

        // Create Vehicles
        Car car1 = new Car(101, 1001, VehicleType.CAR, "Toyota", "Camry", 5000, Date.valueOf("2021-01-01"),
                15, 2000, 2000, 200, 5, Status.ACTIVE);
        
        Car car2 = new Car(102, 1002, VehicleType.CAR, "Hyundai", "Creta", 3000, Date.valueOf("2022-06-15"),
                12, 1800, 2500, 250, 7, Status.ACTIVE);

        // Add Vehicles to Store 1
        store1.addVehicle(car1);
        store1.addVehicle(car2);

        Store retrievedStore = carRentalSystem.getStore(loc1);
        if (retrievedStore != null) {
            System.out.println("Store found: " + retrievedStore.getStoreName());
            
            // Make a Reservation
            System.out.println("Making a reservation for Sagar ray...");
            store1.makeReservation(user1, VehicleType.CAR);

            // Submit Vehicle
            System.out.println("Submitting vehicle after usage...");
            store1.submitVehicle(car1, 5);

            // Retrieve Store by Location
            System.out.println("Retrieving store by location...");
        } else {
            System.out.println("No store found at the given location.");
        }
        
    }
}
