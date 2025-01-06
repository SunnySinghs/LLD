package Design.Splitwise.Expense;

public class UserBalance {
    private int userId;
    private double amount;

    public UserBalance(int userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int getUserId() {
        return userId;
    }
}
