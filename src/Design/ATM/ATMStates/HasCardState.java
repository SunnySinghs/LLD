package Design.ATM.ATMStates;

import Design.ATM.ATM;
import Design.ATM.Card;

public class HasCardState extends ATMState{

    public HasCardState() {
        System.out.println("Please enter your PIN");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPin = card.isCorrectPINEntered(pin);
        if(isCorrectPin) {
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            atm.setCurrentATMState(new IdleState());
        }
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
