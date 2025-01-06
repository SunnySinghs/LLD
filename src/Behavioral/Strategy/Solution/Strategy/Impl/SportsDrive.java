package Behavioral.Strategy.Solution.Strategy.Impl;

import Behavioral.Strategy.Solution.Strategy.DriveStrategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}
