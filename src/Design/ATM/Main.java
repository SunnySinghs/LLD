package Design.ATM;

public class Main {
    public static void main(String[] args) {
        ATMRoomContext atmRoomContext = new ATMRoomContext();
        atmRoomContext.initialize();

        atmRoomContext.getAtm().printCurrentATMStatus();
        atmRoomContext.getAtm().getCurrentATMState().insertCard(atmRoomContext.getAtm(), atmRoomContext.getUser().getCard());
        atmRoomContext.getAtm().getCurrentATMState().authenticatePin(atmRoomContext.getAtm(), atmRoomContext.getUser().getCard(), 211211);
        atmRoomContext.getAtm().getCurrentATMState().selectOperations(atmRoomContext.getAtm(), atmRoomContext.getUser().getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoomContext.getAtm().getCurrentATMState().cashWithdrawal(atmRoomContext.getAtm(), atmRoomContext.getUser().getCard(), 2700);
        atmRoomContext.getAtm().printCurrentATMStatus();
    }
}
