package Behavioral.Template.Interface.Impl;

import Behavioral.Template.Interface.PaymentFlow;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic to PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic to PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fee charged for PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining amount");
    }
}
