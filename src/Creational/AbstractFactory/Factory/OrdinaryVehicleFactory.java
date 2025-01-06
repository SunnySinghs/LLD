package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Product.Brezza;
import Creational.AbstractFactory.Product.Swift;
import Creational.AbstractFactory.Product.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if("Swift".equalsIgnoreCase(type)) {
            return new Swift();
        } else if ("Brezza".equalsIgnoreCase(type)) {
            return new Brezza();
        }
        return null;
    }
}
