package Dispatchers;
import java.util.ArrayList;
import ElevatorController.ElevatorController;

public class Dispatcher {
    public ArrayList<ElevatorController> controllers=new ArrayList<ElevatorController>();

    public void addElevatorController(ElevatorController ele){
        this.controllers.add(ele);
    }

    public void removeElevatorController(ElevatorController ele){
        this.controllers.remove(ele);
    }
}
