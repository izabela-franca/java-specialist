package exercise1;

public class MenuItem {

    String description;
    double price;

    boolean costsBetween(double minPrice, double maxPrice) {
        return price >= minPrice && price <= maxPrice;
    }

    void printItems() {
        System.out.printf("%s x R$%.2f%n", description, price);
    }

}
