package LiskovSubsituition.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Car());
        list.add(new Bike());
        list.add(new BiCycle());

        for(Vehicle v: list) {
            System.out.println(v.getNoOfVehicle().toString());
            //System.out.println(v.hasEngine().toString());
        }
    }
}
