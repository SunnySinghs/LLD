package Design.ATM.AmountWithdrawal;

import Design.ATM.ATM;

public class FiveHundredWithdrawalProcessor extends CashWithdrawalProcessor{

    public FiveHundredWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }

    public boolean withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if (required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        } else {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance += (required - atm.getNoOfFiveHundredNotes()) * 500;
        }

        if (balance != 0) {
            return super.withdraw(atm, balance);
        } else {
            return true;
        }
    }
}
