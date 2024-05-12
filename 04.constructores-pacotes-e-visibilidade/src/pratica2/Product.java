package pratica2;

import java.util.Objects;
import java.util.UUID;

public class Product {

    static final int INITIAL_STOCK = 100;

    final String id;
    String name;
    int itemsInStock;

    Product() {
        this("No nome");
    }

    Product(String name) {
        this(name, INITIAL_STOCK);
    }

    Product(String name, int itemsInStock) {
        Objects.requireNonNull(name, "Name is required");
        if (itemsInStock < 0) {
            throw new IllegalArgumentException("Stock must not be negative");
        }

        this.name = name;
        this.itemsInStock = itemsInStock;
        this.id = UUID.randomUUID().toString();
    }
}
