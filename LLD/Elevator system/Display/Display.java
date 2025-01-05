package Display;
import Direction.Direction;

public class Display {
    int currentFloor;
    Direction dis;

    public Display(){
        this.currentFloor=0;
        this.dis=Direction.IDLE;
    }

    // set display
    public void setDisplay(int currentFloor,Direction dis){
        this.currentFloor=currentFloor;
        this.dis=dis;
    }

    // show display
    public void showDisplay(){
        System.out.println("Current Floor is "+this.currentFloor);
        System.out.println("Moving Direction of Elevator is "+this.dis.name());
    }
}
