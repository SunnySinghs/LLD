package Behavioral.State.VendingMachine.Model;

public class Inventory {
    private ItemShelf[] inventory = null;

    public Inventory(int size) {
        inventory = new ItemShelf[size];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i=0; i<inventory.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int code) throws Exception {
        for (ItemShelf itemShelf: inventory) {
            if (itemShelf.getCode() == code) {
                itemShelf.setItem(item);
                itemShelf.setSoldOut(false);
            } else {
                throw new Exception("already item is present, you can not add item here");
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for (ItemShelf itemShelf: inventory) {
            if (itemShelf.getCode() == code) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("Item already sold out");
                }
            } else {
                return itemShelf.getItem();
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldItem(int code) throws Exception {
        for (ItemShelf itemShelf: inventory) {
            if (itemShelf.getCode() == code) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}

