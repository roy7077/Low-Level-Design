package ElevatorController;

import java.util.PriorityQueue;
import ElevatorCar.ElevatorCar;
import Floor.Floor;
import Direction.Direction;


public class ElevatorController {
    public int ElevatorId=0;
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar){

        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);

    }

    public void submitExternalRequest(Floor floor, Direction direction){

        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor.floorNumber);
        } else {
            upMinPQ.offer(floor.floorNumber);
        }
    }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        while(true) {

            if(elevatorCar.direction == Direction.UP){

            }
        }
    }

}
