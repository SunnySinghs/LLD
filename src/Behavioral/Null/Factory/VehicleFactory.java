package Behavioral.Null.Factory;

import Behavioral.Null.Interface.Impl.Car;
import Behavioral.Null.Interface.Impl.NullVehicle;
import Behavioral.Null.Interface.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String type) {
        if ("CAR".equals(type)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
