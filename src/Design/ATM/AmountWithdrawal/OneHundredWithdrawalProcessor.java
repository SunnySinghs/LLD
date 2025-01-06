package Design.ATM.AmountWithdrawal;

import Design.ATM.ATM;

public class OneHundredWithdrawalProcessor extends CashWithdrawalProcessor{

    public OneHundredWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }

    @Override
    public boolean withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/100;
        int balance = remainingAmount%100;

        if (required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        } else {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance += (required - atm.getNoOfOneHundredNotes()) * 100;
        }

        if (balance != 0) {
            System.out.println("Can't fulfill withdrawal request with current denomination");
            return false;
        } else {
            return true;
        }
    }
}
