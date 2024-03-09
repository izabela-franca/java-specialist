package practice1;

import practice1.service.DepositService;
import practice1.service.OnlinePaymentService;

public class Main {

    public static void main(String[] args) {

        var supermarket = new Store("Walmart");
        var card1 = new Card("Izabela França");
        var depositService = new DepositService();

        Receipt depositReceipt = depositService.deposit(card1,500);
        depositReceipt.print();

        var paymentService = new OnlinePaymentService();
        Receipt paymentReceipt = paymentService.payment(supermarket, card1, 100);
        paymentReceipt.print();


        System.out.printf("Cardholder: %s\n", card1.getCardholder());
        System.out.printf("Balance: %.2f\n", card1.getBalance());

    }

}
