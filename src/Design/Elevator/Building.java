package Design.Elevator;

import java.util.List;

public class Building {
    private List<Floor> floorList;

    public Building(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public void addFloor(Floor newFloor) {
        floorList.add(newFloor);
    }

    public void removeFloor(Floor removeFloor) {
        floorList.remove(removeFloor);
    }

    public List<Floor> getFloorList() {
        return floorList;
    }
}
