package Design.OrderManagementSystem;

import java.util.Map;

public class WareHouse {
    private ProductInventory inventory;
    private Address address;

    //update inventory
    public void removeItemFromInventory(Map<Integer, Integer> productCountMap) {
        //it will update the items in the inventory based upon product.
        for (Map.Entry<Integer, Integer> entry : productCountMap.entrySet()) {
            inventory.removeStock(entry.getKey(), entry.getValue());
        }
    }

    public void addItemToInventory(Map<Integer, Integer> productCountMap){
        //it will update the items in the inventory based upon product category.
        for (Map.Entry<Integer, Integer> entry : productCountMap.entrySet()) {
            inventory.removeStock(entry.getKey(), entry.getValue());
        }
    }

    public ProductInventory getInventory() {
        return inventory;
    }

    public void setInventory(ProductInventory inventory) {
        this.inventory = inventory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
