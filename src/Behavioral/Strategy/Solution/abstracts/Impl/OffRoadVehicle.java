package Behavioral.Strategy.Solution.abstracts.Impl;

import Behavioral.Strategy.Solution.Strategy.Impl.SportsDrive;
import Behavioral.Strategy.Solution.abstracts.Vehicle;

public class OffRoadVehicle extends Vehicle {


    public OffRoadVehicle() {
        super(new SportsDrive());
    }
}
