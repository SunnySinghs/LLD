package Design.Elevator;

import Design.Elevator.Enum.Direction;
import Design.Elevator.Enum.ElevatorState;

public class ElevatorCar {
    private int id;
    private ElevatorDisplay elevatorDisplay;
    private InternalButtons internalButtons;
    private ElevatorDoor elevatorDoor;
    ElevatorState elevatorState;

    public ElevatorCar(int id) {
        this.id = id;
        this.elevatorDisplay = new ElevatorDisplay(0);
        this.internalButtons = new InternalButtons();
        this.elevatorDoor = new ElevatorDoor(false);
        this.elevatorState = ElevatorState.IDLE;
    }

    public void showDisplay() {
        elevatorDisplay.display();
    }

    public int getId() {
        return id;
    }

    public ElevatorDisplay getElevatorDisplay() {
        return elevatorDisplay;
    }

    public InternalButtons getInternalButtons() {
        return internalButtons;
    }

    public ElevatorDoor getElevatorDoor() {
        return elevatorDoor;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public boolean move(int destinationFloor) {
        this.elevatorState = ElevatorState.MOVING;
        if (this.getElevatorDisplay().getCurrentFloor() < destinationFloor) {
            return moveElevator(Direction.UP, destinationFloor);
        } else if (this.getElevatorDisplay().getCurrentFloor() < destinationFloor) {
            return moveElevator(Direction.DOWN, destinationFloor);
        } else {
            this.elevatorState = ElevatorState.IDLE;
            openDoors(destinationFloor);
            return true;
        }
    }

    private boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = elevatorDisplay.getCurrentFloor();
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {
                elevatorDisplay.setCurrentFloor(startFloor);
                showDisplay();
                if(i == destinationFloor) {
                    this.elevatorState = ElevatorState.IDLE;
                    openDoors(destinationFloor);
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {
                elevatorDisplay.setCurrentFloor(startFloor);
                showDisplay();
                if(i == destinationFloor) {
                    this.elevatorState = ElevatorState.IDLE;
                    openDoors(destinationFloor);
                    return true;
                }
            }
        }
        return false;
    }

    private void openDoors(int destinationFloor) {
        this.elevatorDoor.setDoorsOpen(true);
        System.out.println("Doors opened at floor " + destinationFloor);
        this.elevatorDoor.setDoorsOpen(false);
    }

}
