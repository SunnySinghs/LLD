package Design.ATM;

public class ATMRoomContext {

    private ATM atm;
    private User user;

    public void initialize() {
        atm = ATM.getInstance();
        atm.setATMBalance(3500, 1, 2, 5);
        this.user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){
        Card card = new Card();
        card.setUserBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {
        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.setBalance(3000);
        return bankAccount;
    }

    public ATM getAtm() {
        return atm;
    }

    public User getUser() {
        return user;
    }
}
