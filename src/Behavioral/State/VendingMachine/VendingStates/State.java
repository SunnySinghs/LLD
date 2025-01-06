package Behavioral.State.VendingMachine.VendingStates;

import Behavioral.State.VendingMachine.Enum.Coin;
import Behavioral.State.VendingMachine.Model.Item;
import Behavioral.State.VendingMachine.Model.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;
    public int getChange(int coin) throws Exception;
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception;

}
