package Design.Splitwise.Group;

import Design.Splitwise.Expense.Expense;
import Design.Splitwise.Expense.ExpenseController;
import Design.Splitwise.Expense.ExpenseSplitType;
import Design.Splitwise.Expense.Split.Split;
import Design.Splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;
    private ExpenseController expenseController;

    public GroupController(){
        groupList = new ArrayList<>();
        this.expenseController = new ExpenseController();
    }

    //create group
    public void createNewGroup(int groupId, String groupName, User createdByUser) {
        //create a new group
        Group group = new Group(groupId, groupName);
        //add the user into the group, as it is created by the USER
        group.addUser(createdByUser);
        //add the group in the list of overall groups
        groupList.add(group);
    }

    public Group getGroup(int groupId){
        for(Group group: groupList) {
            if(group.getId() == groupId){
                return group;
            }
        }
        return null;
    }

    public Expense createExpense(Group group, int expenseId, String description, User paidByUser, double expenseAmount,
                                 ExpenseSplitType splitType, List<Split> splitDetails) {

        Expense expense = expenseController.createExpense(expenseId, description, paidByUser, expenseAmount, splitType, splitDetails);
        group.getExpenseList().add(expense);
        return expense;
    }

}
