package exercicio2;

public class MenuItem {

    String description;
    double price;

    boolean hasPriceBetween(double minPrice, double maxPrice) {
        return price >= minPrice && price <= maxPrice;
    }

    void printList() {
        System.out.printf("%s x R$%.2f%n", description, price);
    }

}
