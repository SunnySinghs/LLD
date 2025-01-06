package Design.Splitwise.Group;

import Design.Splitwise.Expense.Expense;
import Design.Splitwise.Expense.ExpenseController;
import Design.Splitwise.Expense.ExpenseSplitType;
import Design.Splitwise.Expense.Split.Split;
import Design.Splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String name;
    private List<User> users;
    private List<Expense> expenseList;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.users = new ArrayList<>();
        this.expenseList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }


}
