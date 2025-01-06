package Design.Splitwise.Expense.Split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit{
    @Override
    public void validateRequest(List<Split> splitList, double totalAmount) {

        double amount = 0;
        for (Split split: splitList) {
            amount += split.getAmount();
        }

        if(amount != totalAmount) {
            throw  new RuntimeException("Total amount not matched with split amount.");
        }
    }
}
