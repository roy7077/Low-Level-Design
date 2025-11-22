package components;

public class Vehicle {
    DriveInterface obj;

    public Vehicle(DriveInterface obj){
        this.obj=obj;
    }

    public void startDrive(){
        this.obj.drive();
    }
}