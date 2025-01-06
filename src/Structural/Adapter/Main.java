package Structural.Adapter;

import Structural.Adapter.Adaptee.Impl.WeightMachineForBabies;
import Structural.Adapter.Adapter.Impl.WeightMachineAdapterImpl;
import Structural.Adapter.Adapter.WeightMachineAdapter;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
