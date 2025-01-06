package Design.Payment.Transaction;

import Design.Payment.Instrument.InstrumentController;
import Design.Payment.Instrument.InstrumentDO;

import java.util.*;

public class TransactionService {
    private static Map<Integer, List<Transaction>> userVsTransactionList = new HashMap();
    private InstrumentController instrumentController;
    private Processor processor;

    public TransactionService() {
        this.instrumentController = new InstrumentController();
        this.processor = new Processor();
    }

    public List<Transaction> getTransactionList(int userId) {
        return userVsTransactionList.get(userId);
    }

    public TransactionDO makePayment(TransactionDO transactionDO) {
        InstrumentDO senderInstrumentDO = instrumentController.getInstrument(transactionDO.getSenderUserId(), transactionDO.getDebitInstrumentId());
        InstrumentDO receiverInstrumentDO = instrumentController.getInstrument(transactionDO.getReceiverUserId(), transactionDO.getCreditInstrumentId());

        processor.processPayment(senderInstrumentDO, receiverInstrumentDO);

        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDO.getAmount());
        transaction.setTxnId(new Random().nextInt(100));
        transaction.setSenderUserId(transactionDO.getSenderUserId());
        transaction.setReceiverUserId(transactionDO.getReceiverUserId());
        transaction.setCreditInstrumentId(transactionDO.getCreditInstrumentId());
        transaction.setDebitInstrumentId(transactionDO.getDebitInstrumentId());
        transaction.setTransactionStatus(TransactionStatus.SUCCESS);

        List<Transaction> senderTransactionList = userVsTransactionList.get(transaction.getSenderUserId());
        if (senderTransactionList == null) {
            senderTransactionList = new ArrayList<>();
            userVsTransactionList.put(transaction.getSenderUserId(), senderTransactionList);
        }
        senderTransactionList.add(transaction);

        List<Transaction> receiverTransactionList = userVsTransactionList.get(transaction.getReceiverUserId());
        if (receiverTransactionList == null) {
            receiverTransactionList = new ArrayList<>();
            userVsTransactionList.put(transaction.getSenderUserId(), receiverTransactionList);
        }
        receiverTransactionList.add(transaction);

        transactionDO.setTxnId(transaction.getTxnId());
        transactionDO.setTransactionStatus(transaction.getTransactionStatus());
        return transactionDO;
    }
}
