package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.VehicleFactory;
import Creational.AbstractFactory.Product.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = FactoryProducer.getFactory("Luxury");
        Vehicle vehicle = vehicleFactory.getVehicle("BMW");
        vehicle.type();
    }
}
