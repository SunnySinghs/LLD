package Structural.Adapter.Adaptee.Impl;

import Structural.Adapter.Adaptee.WeightedMachine;

public class WeightMachineForBabies implements WeightedMachine {
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
