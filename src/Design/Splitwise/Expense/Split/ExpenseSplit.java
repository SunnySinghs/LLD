package Design.Splitwise.Expense.Split;

import java.util.List;

public interface ExpenseSplit {
    public void validateRequest(List<Split> splitList, double totalAmount);
}
