package Behavioral.Strategy.Solution.abstracts.Impl;

import Behavioral.Strategy.Solution.Strategy.Impl.NormalDrive;
import Behavioral.Strategy.Solution.abstracts.Vehicle;

public class NormalVehicle extends Vehicle {

    public NormalVehicle() {
        super(new NormalDrive());
    }
}
