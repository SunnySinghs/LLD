package Behavioral.Strategy.Problem;

import Behavioral.Strategy.Problem.abstracts.Impl.OffRoadVehicle;
import Behavioral.Strategy.Problem.abstracts.Vehicle;

// Problem is when child needs to implement the same capability if multiple child have same capability but parent doesn't have the same capability

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
