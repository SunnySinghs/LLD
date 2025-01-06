package Design.Elevator;

import Design.Elevator.Enum.Direction;
import Design.Elevator.Enum.ElevatorState;

import java.util.List;
import java.util.PriorityQueue;

public class ExternalDispatcher {
    List<ElevatorController> elevatorControllerList;
    private PriorityQueue<Integer> upMinPQ;
    private PriorityQueue<Integer> downMaxPQ;

    public ExternalDispatcher() {
        this.elevatorControllerList = ElevatorCreator.elevatorControllerList;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if (Direction.UP == direction) {
            upMinPQ.offer(floor);
        } else {
            downMaxPQ.offer(floor);
        }
    }

    public void handleRequest() {
        while(!upMinPQ.isEmpty()) {
            ElevatorController elevatorController = findBestElevatorController(upMinPQ.peek(), Direction.UP);
            if (elevatorController != null) {

            }
        }
    }

    private ElevatorController findBestElevatorController(Integer requestedFloor, Direction direction) {
        ElevatorController elevatorController = null;
        int minDistance = Integer.MAX_VALUE;

        for (ElevatorController eleContr : elevatorControllerList) {
            if (eleContr.getElevatorCar().getElevatorState() == ElevatorState.IDLE ||
                    (eleContr.getElevatorCar().getElevatorDisplay().getDirection() == Direction.UP && direction == Direction.UP) ||
                    (eleContr.getElevatorCar().getElevatorDisplay().getDirection() == Direction.DOWN && direction == Direction.DOWN)){
                    int distance = Math.abs(eleContr.getElevatorCar().getElevatorDisplay().getCurrentFloor() - requestedFloor);

                    if (minDistance > distance) {
                        minDistance = distance;
                        elevatorController = eleContr;
                    }
            }
        }
        return elevatorController;
    }






    /*public void submitExternalRequest(int floor, Direction direction) {

        //for simplicity, I am following even odd
        for (ElevatorController elevatorController: elevatorControllerList) {
            int elevatorId = elevatorController.getElevatorCar().getId();
            if (elevatorId % 2 == 1 && floor % 2 == 1) {
                elevatorController.submitExternalRequest(floor, direction);
            } else if (elevatorId % 2 == 0 && floor % 2 == 0) {
                elevatorController.submitExternalRequest(floor, direction);
            }
        }
    }*/
}
