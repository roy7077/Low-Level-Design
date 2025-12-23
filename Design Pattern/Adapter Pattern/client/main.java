package client;

import adapte.WeightMachineImpl;
import adapter.WeightMachineAdapterImplKg;
import adapter.WeightMachineAdapterInterface;

public class main {
    public static void main(String[] args) {
        WeightMachineAdapterInterface machine = new WeightMachineAdapterImplKg(new WeightMachineImpl());
        System.out.println(machine.getWeight());
    }
}