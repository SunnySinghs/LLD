package Behavioral.State.VendingMachine.VendingStates.Impl;

import Behavioral.State.VendingMachine.Enum.Coin;
import Behavioral.State.VendingMachine.Model.Item;
import Behavioral.State.VendingMachine.Model.VendingMachine;
import Behavioral.State.VendingMachine.VendingStates.State;

import java.util.List;

public class SelectionState implements State {
    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItem(code);
        int paidByUser = vendingMachine.getCoins().stream().mapToInt(i->i.value).sum();
        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refund(vendingMachine);
            throw new Exception("insufficient amount");
        } else if (paidByUser >= item.getPrice()) {
            if (paidByUser > item.getPrice())
                getChange(paidByUser-item.getPrice());

            vendingMachine.setState(new DispenseState(vendingMachine, code));
        }
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setState(new IdleState(vendingMachine));
        return vendingMachine.getCoins();
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public int getChange(int coin) throws Exception {
        //actual logic should be to return COINs in the dispense tray, but for simplicity I am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + coin);
        return coin;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
