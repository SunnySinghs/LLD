package Design.Payment;

import Design.Payment.Instrument.InstrumentController;
import Design.Payment.Instrument.InstrumentDO;
import Design.Payment.Instrument.InstrumentType;
import Design.Payment.Transaction.Transaction;
import Design.Payment.Transaction.TransactionController;
import Design.Payment.Transaction.TransactionDO;
import Design.Payment.User.UserController;
import Design.Payment.User.UserDO;

import java.util.List;

public class PaymentGateway {
    public static void main(String[] args) {
        InstrumentController instrumentController = new InstrumentController();
        UserController userController = new UserController();
        TransactionController transactionController = new TransactionController();

        UserDO user1 = new UserDO();
        user1.setName("aaaaa");
        user1.setEmail("a@a.com");
        UserDO user1Details = userController.addUser(user1);

        UserDO user2 = new UserDO();
        user2.setName("bbbbb");
        user2.setEmail("b@b.com");
        UserDO user2Details = userController.addUser(user2);

        InstrumentDO bankInstrumentDO = new InstrumentDO();
        bankInstrumentDO.setUserId(user1Details.getUserId());
        bankInstrumentDO.setBankAccNo("78789879798");
        bankInstrumentDO.setInstrumentType(InstrumentType.BANK);
        bankInstrumentDO.setIfscCode("YU78787");
        InstrumentDO user1BankInstrument = instrumentController.addInstrument(bankInstrumentDO);
        System.out.println("Bank Instrument created for user1: "+ user1BankInstrument);

        InstrumentDO cardInstrumentDO = new InstrumentDO();
        cardInstrumentDO.setUserId(user2Details.getUserId());
        cardInstrumentDO.setCardNo("2321");
        cardInstrumentDO.setInstrumentType(InstrumentType.CARD);
        cardInstrumentDO.setCvvNo("233");
        InstrumentDO user2CardInstrument = instrumentController.addInstrument(cardInstrumentDO);
        System.out.println("Card Instrument created for user1: "+ user2CardInstrument);

        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setAmount(10);
        transactionDO.setSenderUserId(user1Details.getUserId());
        transactionDO.setReceiverUserId(user2Details.getUserId());
        transactionDO.setDebitInstrumentId(user1BankInstrument.getInstrumentId());
        transactionDO.setCreditInstrumentId(user2CardInstrument.getInstrumentId());
        transactionController.makePayment(transactionDO);

        List<Transaction> transactionList = transactionController.getTransactionHistory(user1Details.getUserId());
        transactionList.forEach(System.out::println);

    }
}
