package Design.OrderManagementSystem;

import java.util.List;

public abstract class WareHouseStrategy {
    public abstract WareHouse selectWarehouse(List<WareHouse> warehouseList);
}
