package Vehicle;
import java.sql.Date;

public class Car extends Vehicle {

    // constructor
    public Car(int vehicleID, int vehicleNumber, VehicleType type,
               String companyName, String modelName, int kmDriven, Date manufactureDate,
               int average, int cc, int dailyRentalCost, int hourlyRentalCost,
               int noOfSeat, Status status) {

        super(vehicleID, vehicleNumber, type, companyName, modelName, kmDriven,
              manufactureDate, average, cc, dailyRentalCost, hourlyRentalCost, noOfSeat, status);
        }
}
