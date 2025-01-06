package Design.Splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
    private Map<Integer, Balance> userVsBalance;
    private double totalExpense;
    private double totalPayment;
    private double totalYouOwe;
    private double totalYouGetBack;

    public UserExpenseBalanceSheet() {
        this.userVsBalance = new HashMap<>();
        this.totalExpense = 0;
        this.totalPayment = 0;
        this.totalYouOwe = 0;
        this.totalYouGetBack = 0;
    }

    public Map<Integer, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public void setUserVsBalance(Map<Integer, Balance> userVsBalance) {
        this.userVsBalance = userVsBalance;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
}
