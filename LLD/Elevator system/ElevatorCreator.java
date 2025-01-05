import java.util.ArrayList;
import java.util.List;

import ElevatorCar.ElevatorCar;
import ElevatorController.ElevatorController;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {
        ElevatorCar elevatorCar1 = new ElevatorCar(1);
        elevatorCar1.ElevatorId =1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar(2);
        elevatorCar1.ElevatorId =2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}