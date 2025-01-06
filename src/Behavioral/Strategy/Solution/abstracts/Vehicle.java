package Behavioral.Strategy.Solution.abstracts;

import Behavioral.Strategy.Solution.Strategy.DriveStrategy;

public abstract class Vehicle {
    public DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive()
    {
        driveStrategy.drive();
    }
}
