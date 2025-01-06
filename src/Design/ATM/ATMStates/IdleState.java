package Design.ATM.ATMStates;

import Design.ATM.ATM;
import Design.ATM.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card Inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
