package Design.ATM.ATMStates;

import Design.ATM.ATM;
import Design.ATM.AmountWithdrawal.CashWithdrawalProcessor;
import Design.ATM.AmountWithdrawal.FiveHundredWithdrawalProcessor;
import Design.ATM.AmountWithdrawal.OneHundredWithdrawalProcessor;
import Design.ATM.AmountWithdrawal.TwoThousandWithdrawalProcessor;
import Design.ATM.Card;

public class CashWithdrawalState extends ATMState{

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int amount) {
        if (atm.getAtmBalance() < amount) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getBalance() < amount) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {
            CashWithdrawalProcessor cashWithdrawalProcessor = new TwoThousandWithdrawalProcessor(
                    new FiveHundredWithdrawalProcessor(new OneHundredWithdrawalProcessor(null)));
            if (cashWithdrawalProcessor.withdraw(atm, amount)) {
                atm.deductATMBalance(amount);
                card.deductBalance(amount);
                System.out.println("Withdraw Successful");
            }
            exit(atm);
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
