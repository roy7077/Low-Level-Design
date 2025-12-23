package adapter;

import adapte.WeightMachineInterface;

public class WeightMachineAdapterImplKg implements WeightMachineAdapterInterface{
    private WeightMachineInterface weightMachine;
    public WeightMachineAdapterImplKg(WeightMachineInterface machine){
        this.weightMachine=machine;
    }

    public double getWeight() {
      return this.weightMachine.getWeight() * 0.453592;
   }
}
