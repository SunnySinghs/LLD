package Design.Splitwise.User;

import Design.Splitwise.UserExpenseBalanceSheet;

public class User {
    private int id;
    private String name;
    private UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

}
