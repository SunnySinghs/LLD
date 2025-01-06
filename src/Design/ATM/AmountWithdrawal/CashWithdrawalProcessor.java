package Design.ATM.AmountWithdrawal;

import Design.ATM.ATM;

public abstract class CashWithdrawalProcessor {
    private CashWithdrawalProcessor nextCashWithdrawalProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor) {
        this.nextCashWithdrawalProcessor = cashWithdrawalProcessor;
    }

    public boolean withdraw(ATM atm, int remainingAmount) {
        if (nextCashWithdrawalProcessor != null) {
           return nextCashWithdrawalProcessor.withdraw(atm, remainingAmount);
        }
        return false;
    }
}
