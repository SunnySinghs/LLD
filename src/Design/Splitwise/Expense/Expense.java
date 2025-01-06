package Design.Splitwise.Expense;

import Design.Splitwise.Expense.Split.Split;
import Design.Splitwise.User.User;

import java.util.List;

public class Expense {
    private int id;
    private String description;
    private User paidBy;
    private double amount;
    private ExpenseSplitType splitType;
    private List<Split> splitList;

    public Expense(int id, String description, User paidBy, double amount, ExpenseSplitType splitType, List<Split> splitList) {
        this.id = id;
        this.description = description;
        this.paidBy = paidBy;
        this.amount = amount;
        this.splitType = splitType;
        this.splitList = splitList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseSplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(ExpenseSplitType splitType) {
        this.splitType = splitType;
    }

    public List<Split> getSplitList() {
        return splitList;
    }

    public void setSplitList(List<Split> splitList) {
        this.splitList = splitList;
    }
}
