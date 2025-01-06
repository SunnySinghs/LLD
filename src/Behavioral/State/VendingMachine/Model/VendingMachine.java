package Behavioral.State.VendingMachine.Model;

import Behavioral.State.VendingMachine.Enum.Coin;
import Behavioral.State.VendingMachine.VendingStates.Impl.IdleState;
import Behavioral.State.VendingMachine.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    List<Coin> coins;

    public VendingMachine() {
        this.state = new IdleState();
        this.inventory = new Inventory(10);
        this.coins = new ArrayList<>();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
