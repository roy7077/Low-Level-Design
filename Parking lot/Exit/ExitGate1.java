package Exit;

import FeesCalculation.FeesCalculationFactory;
import ParkingManager.ParkingManager;
import Tickets.Tickets;

public class ExitGate1 {
    private Tickets tc;
    private ParkingManager manager;
    public ExitGate1(Tickets obj){
        tc=obj;
        manager=obj.getManagerObj();
    }

    // get fees
    public int getFees(){
        FeesCalculationFactory obj1=new FeesCalculationFactory(tc);
        return obj1.getFees();
    }

    // release
    public void removeVehicle(){
        manager.remove(tc.getVehicleObj());
    }
}
