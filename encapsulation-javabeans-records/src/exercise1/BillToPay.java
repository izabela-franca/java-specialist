package exercise1;

import java.io.Serializable;

public class BillToPay implements Serializable {

    private String description;
    private double amount;
    private String dueDate;
    private Supplier supplier;
    private boolean paid;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean isPaid() {
        return paid;
    }

    public boolean isPending() {
        return !isPaid();
    }

    public void pay() {
        if (isPaid()) {
            throw new RuntimeException("Bill is already paid");
        }

        paid = true;
    }

    public void cancelPayment() {
        if (isPending()) {
            throw new RuntimeException("Bill needs to be paid");
        }

        paid = false;
    }

}
