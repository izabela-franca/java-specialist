package practice1.service;

import practice1.Card;
import practice1.Receipt;
import practice1.Store;

public class OnlinePaymentService {

    public Receipt payment(Store store, Card card, double amount) {

        card.deposit(amount);

        //TODO

        return new Receipt(card.getCardholder(), "Payment", amount);
    }

}
