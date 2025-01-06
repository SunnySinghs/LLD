package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Product.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String type);
}
