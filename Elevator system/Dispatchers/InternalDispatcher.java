package Dispatchers;
import ElevatorCar.ElevatorCar;
import ElevatorController.ElevatorController;


public class InternalDispatcher extends Dispatcher {
    
    public void addRequest(int key,ElevatorCar ele){
        for (ElevatorController elevatorController : this.controllers) {
            if(elevatorController.ElevatorId==ele.ElevatorId)
            {
                elevatorController.submitInternalRequest(key);
                return ;
            }
        }
    }
}
