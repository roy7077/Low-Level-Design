package ParkingSpace;

public class TwoWheelerParkingSpace extends ParkingSpace{
    public TwoWheelerParkingSpace(int id){
        this.parkingId=id;
        this.fees=100;
        this.status=false;
    }
}
