package Design.Splitwise.Expense;

import Design.Splitwise.BalanceSheetController;
import Design.Splitwise.Expense.Split.ExpenseSplit;
import Design.Splitwise.Expense.Split.Split;
import Design.Splitwise.User.User;

import java.util.List;

public class ExpenseController {
    private BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(int id, String description, User paidBy, double amount, ExpenseSplitType splitType,
                                 List<Split> splitList) {
        ExpenseSplit expenseSplit = SplitFactory.getExpenseSplitInstance(splitType);
        expenseSplit.validateRequest(splitList, amount);

        Expense expense = new Expense(id, description, paidBy, amount, splitType, splitList);
        balanceSheetController.updateUserExpenseBalanceSheet(paidBy, splitList, amount, splitType);
        return expense;

    }
}
