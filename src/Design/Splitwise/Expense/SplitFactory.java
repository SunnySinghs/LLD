package Design.Splitwise.Expense;

import Design.Splitwise.Expense.Split.EqualExpenseSplit;
import Design.Splitwise.Expense.Split.ExpenseSplit;
import Design.Splitwise.Expense.Split.PercentageExpenseSplit;
import Design.Splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getExpenseSplitInstance(ExpenseSplitType expenseSplitType) {
        switch (expenseSplitType) {
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
            default -> {
                return null;
            }
        }
    }
}
