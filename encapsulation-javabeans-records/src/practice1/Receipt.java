package practice1;

public class Receipt {

    public String cardholder;
    public String description;
    public double amount;

    public Receipt(String cardholder, String description, double amount) {

        this.cardholder = cardholder;
        this.description = description;
        this.amount = amount;

    }

    public void print() {
        System.out.println("-----------------------------------");
        System.out.printf("Receipt to %s\n", cardholder);
        System.out.printf("%s -> %.2f\n", description, amount);
        System.out.println("----------------------------------");
    }

}