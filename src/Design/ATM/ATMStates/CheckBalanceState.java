package Design.ATM.ATMStates;

import Design.ATM.ATM;
import Design.ATM.Card;

public class CheckBalanceState extends ATMState{
    public CheckBalanceState() {

    }

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance is: " + card.getBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
