package Design.Splitwise.Expense.Split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit{
    @Override
    public void validateRequest(List<Split> splitList, double totalAmount) {

        double amount = 0;
        for (Split split: splitList) {
            amount += (totalAmount * split.getPercentage())/100;
        }
        if(amount != totalAmount) {
            throw  new RuntimeException("Total amount not matched with split amount.");
        }
    }
}
