package ParkingSpace;

public class FourWheelerParkingSpace extends ParkingSpace{
    FourWheelerParkingSpace(int id){
        this.parkingId=id;
        this.fees=200;
        this.status=false;
    }
}
