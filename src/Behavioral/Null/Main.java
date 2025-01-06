package Behavioral.Null;

import Behavioral.Null.Factory.VehicleFactory;
import Behavioral.Null.Interface.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("CAR1");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Tank capacity:"+ vehicle.getTankCapacity());
        System.out.println("Seating capacity:"+ vehicle.getSeatingCapacity());
    }


}
