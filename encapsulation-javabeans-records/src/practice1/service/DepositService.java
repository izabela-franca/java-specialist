package practice1.service;

import practice1.Card;
import practice1.Receipt;

public class DepositService {

    public Receipt deposit(Card card, double amount) {
        //TODO

        card.deposit(amount);

        return new Receipt(card.getCardholder(),"Deposit",amount);
    }

}
