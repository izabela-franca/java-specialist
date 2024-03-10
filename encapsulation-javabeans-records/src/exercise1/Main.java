package exercise1;

public class Main {

    public static void main(String[] args) {
        Supplier realState = new Supplier("New Life Real State");

        BillToPay rentBill = new BillToPay();
        rentBill.setDescription("Apartment rent");
        rentBill.setAmount(4500);
        rentBill.setDueDate("10/07/2023");
        rentBill.setSupplier(realState);

        printBill(rentBill);

        rentBill.pay();
        printBill(rentBill);

        rentBill.cancelPayment();
        printBill(rentBill);

    }

    public static void printBill(BillToPay bill) {
        System.out.printf("Supplier: %s%n", bill.getSupplier().getName());
        System.out.printf("Description: %s%n", bill.getDescription());
        System.out.printf("Due Date: %s%n", bill.getDueDate());
        System.out.printf("Amount: R$%.2f%n", bill.getAmount());
        System.out.printf("Paid: %s%n", bill.isPaid() ? "Yes" : "No");
        System.out.println();
    }

}
