package Design.Splitwise;

import Design.Splitwise.Expense.ExpenseSplitType;
import Design.Splitwise.Expense.Split.Split;
import Design.Splitwise.Group.Group;
import Design.Splitwise.Group.GroupController;
import Design.Splitwise.User.User;
import Design.Splitwise.User.UserController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Splitwise {
    private UserController userController;
    private GroupController groupController;
    private BalanceSheetController balanceSheetController;

    public Splitwise() {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void demo(){
        setUpGroupAndUsers();

        //Step1: add members to the group
        Group group = groupController.getGroup(1);
        group.addUser(userController.getUser(2001));
        group.addUser(userController.getUser(3001));

        //Step2. create an expense inside a group
        // 1st Expense
        List<Split> splitList = new ArrayList<>();
        Split split1 = new Split(userController.getUser(1001));
        split1.setAmount(100);
        Split split2 = new Split(userController.getUser(2001));
        split2.setAmount(100);
        Split split3 = new Split(userController.getUser(3001));
        split3.setAmount(100);

        splitList.add(split1);
        splitList.add(split2);
        splitList.add(split3);

        groupController.createExpense(group, 100001, "Breakfast", userController.getUser(1001), 300, ExpenseSplitType.EQUAL, splitList);

        // 2nd Expense
        List<Split> splitList1 = new ArrayList<>();
        Split split11 = new Split(userController.getUser(1001));
        split11.setPercentage(50);
        Split split21 = new Split(userController.getUser(2001));
        split21.setPercentage(30);
        Split split31 = new Split(userController.getUser(3001));
        split31.setPercentage(20);

        splitList1.add(split11);
        splitList1.add(split21);
        splitList1.add(split31);

        groupController.createExpense(group, 100002, "Lunch", userController.getUser(2001), 1000, ExpenseSplitType.PERCENTAGE, splitList1);

        Map<Integer, Double> balanceMap = new HashMap<>();
        for(User user : userController.getAllUsers()) {
            balanceSheetController.showBalanceSheetOfUser(user);
            balanceMap.put(user.getId(), user.getUserExpenseBalanceSheet().getTotalYouGetBack() - user.getUserExpenseBalanceSheet().getTotalYouOwe());
        }

        balanceSheetController.simplifyDebts(balanceMap);

    }

    private void setUpGroupAndUsers() {
        addUsers();

        User user1 = userController.getUser(1001);
        groupController.createNewGroup(1, "Group1", user1);
    }

    private void addUsers() {
        //adding User1
        User user1 = new User(1001, "User1");
        //adding User2
        User user2 = new User (2001, "User2");
        //adding User3
        User user3 = new User (3001, "User3");
        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
