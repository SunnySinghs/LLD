package Design.ATM;

import java.time.LocalDate;

public class Card {
    private int cardNumber;
    private int cvv;
    private LocalDate expiryDate;
    private String holderName;
    private int pin = 211211;
    private UserBankAccount userBankAccount;

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }

    public boolean isCorrectPINEntered(int pin) {
        if (this.pin == pin) {
            return true;
        }
        return false;
    }

    public int getBalance() {
       return userBankAccount.getBalance();
    }

    public void deductBalance(int balance) {
        userBankAccount.withdrawalBalance(balance);
    }
}
