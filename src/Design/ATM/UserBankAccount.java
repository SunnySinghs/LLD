package Design.ATM;

public class UserBankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }
}
