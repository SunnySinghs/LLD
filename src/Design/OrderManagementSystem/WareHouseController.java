package Design.OrderManagementSystem;

import java.util.List;

public class WareHouseController {
    private List<WareHouse> wareHouseList;
    private WareHouseStrategy wareHouseStrategy;

    public WareHouseController(List<WareHouse> wareHouseList, WareHouseStrategy wareHouseStrategy) {
        this.wareHouseList = wareHouseList;
        this.wareHouseStrategy = wareHouseStrategy;
    }

    public List<WareHouse> getWareHouseList() {
        return wareHouseList;
    }

    public WareHouseStrategy getWareHouseStrategy() {
        return wareHouseStrategy;
    }

    public WareHouse selectWareHouse(WareHouseStrategy wareHouseStrategy) {
        this.wareHouseStrategy = wareHouseStrategy;
        return wareHouseStrategy.selectWarehouse(wareHouseList);
    }
}
