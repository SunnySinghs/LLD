package Design.Elevator;

public class ElevatorDoor {
    private boolean doorsOpen;

    public ElevatorDoor(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }
}
