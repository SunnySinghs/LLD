package Structural.Adapter.Adapter.Impl;

import Structural.Adapter.Adaptee.WeightedMachine;
import Structural.Adapter.Adapter.WeightMachineAdapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    private WeightedMachine weightedMachine;

    public WeightMachineAdapterImpl(WeightedMachine weightedMachine) {
        this.weightedMachine = weightedMachine;
    }

    @Override
    public double getWeightInKg() {
        double weight = weightedMachine.getWeightInPound();
        return weight * 0.45;
    }
}
