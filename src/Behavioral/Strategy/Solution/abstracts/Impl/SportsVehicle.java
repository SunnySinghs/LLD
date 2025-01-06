package Behavioral.Strategy.Solution.abstracts.Impl;

import Behavioral.Strategy.Solution.Strategy.Impl.SportsDrive;
import Behavioral.Strategy.Solution.abstracts.Vehicle;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDrive());
    }

}
