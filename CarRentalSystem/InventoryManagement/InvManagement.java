package InventoryManagement;
import java.util.ArrayList;

import Vehicle.Status;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class InvManagement {
    ArrayList<Vehicle> VList;

    // Constructor
    public InvManagement(){
        VList = new ArrayList<Vehicle>();
    }

    // setter
    public void addVehicle(Vehicle vech){
        VList.add(vech);
    }

    public void ChangeStatus(int vehicleID,Status st){
        for (Vehicle v : VList) { 
            if(v.getVehicleID()==vehicleID){
                v.setStatus(st);
                return ;
            }
        }
    }

    public void removeVechicle(Vehicle vch){
        VList.remove(vch);
    }

    // getter
    public Vehicle getActiveVehicle(VehicleType type) {
        for (Vehicle v : VList) { 
            if (v.getStatus()==Status.ACTIVE && v.getType()==type) 
            return v;
        }
        return null;
    }
    
}
