package Design.Splitwise.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{
    @Override
    public void validateRequest(List<Split> splitList, double totalAmount) {

        //validate total amount in splits of each user is equal and overall equals to totalAmount or not
        double amount = totalAmount/splitList.size();
        for (Split split: splitList) {
            if (split.getAmount() != amount) {
                throw new RuntimeException("Total amount not matched with split amount.");
            }
        }
    }
}
