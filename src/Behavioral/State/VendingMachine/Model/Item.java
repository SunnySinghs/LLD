package Behavioral.State.VendingMachine.Model;

import Behavioral.State.VendingMachine.Enum.ItemType;

public class Item {
    private int price;
    private ItemType itemType;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
