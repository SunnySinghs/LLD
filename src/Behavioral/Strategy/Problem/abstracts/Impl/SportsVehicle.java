package Behavioral.Strategy.Problem.abstracts.Impl;

import Behavioral.Strategy.Problem.abstracts.Vehicle;

public class SportsVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}
