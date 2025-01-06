package Behavioral.Template;

import Behavioral.Template.Interface.Impl.PayToFriend;
import Behavioral.Template.Interface.PaymentFlow;

public class Main {
    public static void main(String[] args) {
        PaymentFlow payment = new PayToFriend();
        payment.sendMoney();
    }
}
