package Vehicle;
import java.sql.Date;

public class Vehicle {
    int vehicleID;
    int vehicleNumber;
    VehicleType type;
    String companyName;
    String modelName;
    int kmDriven;
    Date manufactureDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;
    Status status;


    // Constructor
    public Vehicle(int vehicleID,int vehicleNumber,VehicleType type,
    String companyName,String modelName,int kmDriven,Date manufactureDate,int average,
    int cc,int dailyRentalCost,int hourlyRentalCost,int noOfSeat,Status status){
        this.vehicleID=vehicleID;
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.companyName=companyName;
        this.modelName=modelName;
        this.kmDriven=kmDriven;
        this.manufactureDate=manufactureDate;
        this.average=average;
        this.cc=cc;
        this.dailyRentalCost=dailyRentalCost;
        this.hourlyRentalCost=hourlyRentalCost;
        this.noOfSeat=noOfSeat;
        this.status=status;
    }

    // setter
    public void setStatus(Status status) {
        this.status = status;
    }

    // getters
    public int getVehicleID() {
        return vehicleID;
    }

    public VehicleType getType() {
        return type;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public String getModelName() {
        return modelName;
    }
    
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public Status getStatus() {
        return status;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public int getAverage() {
        return average;
    }

    public int getCc() {
        return cc;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
}