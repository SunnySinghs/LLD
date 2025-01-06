package Design.OrderManagementSystem;

import java.util.List;

public class NearestWareHouseSelectionStrategy extends WareHouseStrategy{

    @Override
    public WareHouse selectWarehouse(List<WareHouse> warehouseList) {
        //algo to pick the nearest algo, for now I am just picking the first warehouse for demo purpose
        return warehouseList.get(0);
    }
}
