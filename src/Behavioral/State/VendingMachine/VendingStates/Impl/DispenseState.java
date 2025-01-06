package Behavioral.State.VendingMachine.VendingStates.Impl;

import Behavioral.State.VendingMachine.Enum.Coin;
import Behavioral.State.VendingMachine.Model.Item;
import Behavioral.State.VendingMachine.Model.VendingMachine;
import Behavioral.State.VendingMachine.VendingStates.State;

import java.util.List;

public class DispenseState implements State {
    DispenseState(VendingMachine machine, int code) throws Exception{
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, code);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = vendingMachine.getInventory().getItem(code);
        vendingMachine.getInventory().updateSoldItem(code);
        vendingMachine.setState(new IdleState());
        return null;
    }

    @Override
    public int getChange(int coin) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
