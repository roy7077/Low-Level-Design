package Building;
import java.util.ArrayList;
import Floor.Floor;

public class Building {
    public ArrayList<Floor> floors=new ArrayList<Floor>();
    public Building(ArrayList<Floor> arr){
        this.floors=arr;
    }
}
