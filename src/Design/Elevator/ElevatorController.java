package Design.Elevator;

import Design.Elevator.Enum.Direction;

import java.util.List;


public class ElevatorController {
    private ElevatorCar elevatorCar;
    private List<Integer> destinationQueue;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void addDestination(int floor) {
        if (!destinationQueue.contains(floor)) {
            destinationQueue.add(floor); // Ensure sorted order
        }
    }

    public void submitExternalRequest(int floor){

    }


    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        while(true) {

            if(elevatorCar.getElevatorDisplay().getDirection() == Direction.UP){


            }
        }
    }

}
