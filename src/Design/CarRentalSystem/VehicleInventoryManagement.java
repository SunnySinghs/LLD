package Design.CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    private List<Vehicle> vehicles;

    public VehicleInventoryManagement() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Return a vehicle
    public void returnVehicle(int vehicleId) {
        Vehicle vehicle = findVehicleById(vehicleId);
        if (vehicle != null) {
            vehicle.setAvailable(true);
            System.out.println("Vehicle returned successfully!");
        } else {
            System.out.println("Vehicle not found!");
        }
    }


    // Search for a vehicle by ID
    private Vehicle findVehicleById(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == vehicleId) {
                return vehicle;
            }
        }
        return null;
    }
}
