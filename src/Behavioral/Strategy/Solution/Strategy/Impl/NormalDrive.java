package Behavioral.Strategy.Solution.Strategy.Impl;

import Behavioral.Strategy.Solution.Strategy.DriveStrategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
