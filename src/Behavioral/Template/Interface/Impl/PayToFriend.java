package Behavioral.Template.Interface.Impl;

import Behavioral.Template.Interface.PaymentFlow;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic to PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic to PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fee charged for PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
