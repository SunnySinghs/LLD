package Design.Elevator;

import Design.Elevator.Enum.Direction;

public class ElevatorDisplay {
    private int currentFloor;
    private Direction direction;

    public ElevatorDisplay(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void display() {
        System.out.println("currentFloor=" + currentFloor);
        System.out.println(", direction=" + direction);
    }
}
