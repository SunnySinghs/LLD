package Behavioral.Strategy.Solution;


import Behavioral.Strategy.Solution.abstracts.Impl.NormalVehicle;
import Behavioral.Strategy.Solution.abstracts.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();
    }
}
