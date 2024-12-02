package ElevatorCar;
import Display.Display;
import Door.Door;
import Status.Status;
import Buttons.InternalButtons;
import Direction.Direction;


public class ElevatorCar {
    Door door;
    Display display;
    public Direction direction;
    Status status;
    InternalButtons buttons;
    int currentFloor=0;
    public int ElevatorId;

    // methods
    public ElevatorCar(int id){
        this.door=new Door();
        this.display=new Display();
        this.direction=Direction.UP;
        this.status=Status.IDLE;
        this.buttons=new InternalButtons();
        this.currentFloor=0;
        this.ElevatorId=id;
    }

    public void showDisplay() {
         display.showDisplay();
    }

    public void pressButton(int destination) {
        buttons.keyPress(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor,direction);
        this.showDisplay();
    }

    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }

}
