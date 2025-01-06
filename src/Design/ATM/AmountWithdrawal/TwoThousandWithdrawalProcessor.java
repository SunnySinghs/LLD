package Design.ATM.AmountWithdrawal;

import Design.ATM.ATM;

public class TwoThousandWithdrawalProcessor extends CashWithdrawalProcessor{

    public TwoThousandWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }

    @Override
    public boolean withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;

        if (required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        } else {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance += (required - atm.getNoOfTwoThousandNotes()) * 2000;
        }

        if (balance != 0) {
            return super.withdraw(atm, balance);
        } else {
            return true;
        }
    }
}
