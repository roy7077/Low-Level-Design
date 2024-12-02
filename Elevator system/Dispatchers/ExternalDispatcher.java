package Dispatchers;

import ElevatorController.ElevatorController;
import Direction.Direction;
import Floor.Floor;

public class ExternalDispatcher extends Dispatcher{
    
    public void addRequest(Direction dis,Floor floor){

        // Implementing odd even - assuming that there is only two elevator
        for (ElevatorController elevatorController : controllers) {
            if((floor.floorNumber)%2 == (elevatorController.ElevatorId)%2){
                elevatorController.submitExternalRequest(floor,dis);
                return ;
            }
        }
    }
}
