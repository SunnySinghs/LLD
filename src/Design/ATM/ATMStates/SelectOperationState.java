package Design.ATM.ATMStates;

import Design.ATM.ATM;
import Design.ATM.Card;
import Design.ATM.TransactionType;

public class SelectOperationState extends ATMState{

    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperations(ATM atm, Card card, TransactionType txnType) {
        switch (txnType) {
            case CASH_WITHDRAWAL -> atm.setCurrentATMState(new CashWithdrawalState());
            case CHECK_BALANCE -> atm.setCurrentATMState(new CheckBalanceState());
            default -> System.out.println("Invalid option");
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

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }

}
