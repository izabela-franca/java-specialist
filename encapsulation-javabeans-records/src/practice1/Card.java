package practice1;

import java.io.Serializable;

/*For a class to become JavaBeans, it needs:
    - An empty constructor
    - To implements the interface Serializable
*/

public class Card implements Serializable {

    public static final double DEPOSIT_TAX = 0.10;
    public static final double MINIMUM_DEPOSIT = 50;

    private String cardholder;
    private double balance;

    public Card() {

    }

    public Card(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount) {
        if (getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }

        balance-= amount;
    }

    public void deposit(double amount) {
        if(amount < Card.MINIMUM_DEPOSIT) {
            throw new IllegalArgumentException(String.format("Deposit cannot be less than %.2f", Card.MINIMUM_DEPOSIT));
        }

        balance-= amount - DEPOSIT_TAX;
    }

}
