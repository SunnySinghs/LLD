package Design.Elevator;

import Design.Elevator.Enum.Direction;

public class Floor {
    private ExternalDispatcher externalDispatcher;
    private int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void pressButton(Direction direction) {
        externalDispatcher.submitExternalRequest(floorNumber, direction);
    }
}
