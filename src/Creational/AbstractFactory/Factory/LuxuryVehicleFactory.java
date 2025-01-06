package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Product.Audi;
import Creational.AbstractFactory.Product.BMW;
import Creational.AbstractFactory.Product.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if ("BMW".equalsIgnoreCase(type)) {
            return new BMW();
        } else if ("Audi".equalsIgnoreCase(type)) {
            return new Audi();
        }
        return null;
    }
}
