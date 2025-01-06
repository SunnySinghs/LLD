package Behavioral.State.VendingMachine.VendingStates.Impl;

import Behavioral.State.VendingMachine.Enum.Coin;
import Behavioral.State.VendingMachine.Model.Item;
import Behavioral.State.VendingMachine.Model.VendingMachine;
import Behavioral.State.VendingMachine.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently, Vending machine is in idle state");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently, Vending machine is in idle state");
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("First, you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You can not insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("You can not choose product in idle state");
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be dispensed idle state");
    }

    @Override
    public int getChange(int coin) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        vendingMachine.getInventory().addItem(item, code);
    }
}
