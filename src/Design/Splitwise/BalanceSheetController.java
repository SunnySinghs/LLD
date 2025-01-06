package Design.Splitwise;

import Design.Splitwise.Expense.ExpenseSplitType;
import Design.Splitwise.Expense.Split.Split;
import Design.Splitwise.Expense.UserBalance;
import Design.Splitwise.User.User;

import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class BalanceSheetController {
    public void updateUserExpenseBalanceSheet(User paidBy, List<Split> splitList, double totalAmount, ExpenseSplitType splitType) {
        UserExpenseBalanceSheet paidByUserExpenseSheet = paidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalAmount);

        for(Split split: splitList) {
            User userOwe = split.getUser();
            UserExpenseBalanceSheet userOweExpenseBalanceSheet = userOwe.getUserExpenseBalanceSheet();
            double oweAmount = getAmount(split, splitType, totalAmount);

            if(paidBy.getId() == userOwe.getId()) {
                paidByUserExpenseSheet.setTotalExpense(paidByUserExpenseSheet.getTotalExpense()+oweAmount);
            } else {
                //update the balance of paid user
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack()+oweAmount);
                Balance userOweBalance = paidByUserExpenseSheet.getUserVsBalance().getOrDefault(userOwe.getId(), new Balance());
                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack()+oweAmount);
                paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getId(), userOweBalance);

                //update the balance sheet of owe user
                userOweExpenseBalanceSheet.setTotalYouOwe(userOweExpenseBalanceSheet.getTotalYouOwe()+oweAmount);
                userOweExpenseBalanceSheet.setTotalExpense(userOweExpenseBalanceSheet.getTotalExpense()+oweAmount);
                Balance userPaidBalance = userOweExpenseBalanceSheet.getUserVsBalance().getOrDefault(paidBy.getId(), new Balance());
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe()+oweAmount);
                userOweExpenseBalanceSheet.getUserVsBalance().put(paidBy.getId(), userPaidBalance);
            }
        }
    }

    private double getAmount(Split split, ExpenseSplitType splitType, double totalAmount) {
        if(splitType == ExpenseSplitType.PERCENTAGE) {
            return (totalAmount*split.getPercentage())/100;
        } else  {
            return split.getAmount();
        }
    }

    public void showBalanceSheetOfUser(User user){

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getName());

        UserExpenseBalanceSheet userExpenseBalanceSheet =  user.getUserExpenseBalanceSheet();

        System.out.println("TotalYouExpense: " + userExpenseBalanceSheet.getTotalExpense());
        System.out.println("TotalYouGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYouOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<Integer, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()){

            int userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");

    }

    public void simplifyDebts(Map<Integer, Double> balanceMap) {

        PriorityQueue<UserBalance> creditors = new PriorityQueue<>((a,b) -> Double.compare(b.getAmount(), a.getAmount()));
        PriorityQueue<UserBalance> debtors = new PriorityQueue<>((a,b) -> Double.compare(b.getAmount(), a.getAmount()));

        // Populate queue
        for (Map.Entry<Integer, Double> entry: balanceMap.entrySet()) {
            if (entry.getValue() > 0) {
                creditors.offer(new UserBalance(entry.getKey(), entry.getValue())); // Creditor: Positive balance
            } else {
                debtors.offer(new UserBalance(entry.getKey(), -entry.getValue())); // Debtor: Positive debt for max-priority handling
            }
        }

        // Simplify debts by matching creditors and debtors
        System.out.println("Simplified Settlements:");

        while (!creditors.isEmpty() && !debtors.isEmpty()) {
            UserBalance creditor = creditors.poll();
            UserBalance debtor = debtors.poll();

            double settlementAmount = Math.min(creditor.getAmount(), debtor.getAmount());
            System.out.println("User " + debtor.getUserId() + " pays User " + creditor.getUserId() + ": " + settlementAmount);

            if (creditor.getAmount() >  settlementAmount) {
                creditors.offer(new UserBalance(creditor.getUserId(), creditor.getAmount()-settlementAmount));
            } else if (debtor.getAmount() > settlementAmount) {
                debtors.offer(new UserBalance(debtor.getUserId(), debtor.getAmount()-settlementAmount));
            }
        }
    }
}
