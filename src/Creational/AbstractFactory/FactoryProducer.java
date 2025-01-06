package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.LuxuryVehicleFactory;
import Creational.AbstractFactory.Factory.OrdinaryVehicleFactory;
import Creational.AbstractFactory.Factory.VehicleFactory;

public class FactoryProducer {
    public static VehicleFactory getFactory(String factoryType) {
        if ("Luxury".equalsIgnoreCase(factoryType)) {
            return new LuxuryVehicleFactory();
        } else if ("Ordinary".equalsIgnoreCase(factoryType)) {
            return new OrdinaryVehicleFactory();
        }
        return null;
    }
}
