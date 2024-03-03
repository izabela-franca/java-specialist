package practice1;

import java.util.Objects;

public class Product {

    static final int INITIAL_STOCK = 100;

    String name;
    int itemsInStock;

    //Constructors
    Product() {
        this("No nome");    //it must be the first instruction, when it is being built
        //this.name = "No name";
        //this.itemsInStock  = INITIAL_STOCK;
    }
    //Overriding constructors
    Product(String name) {
        this(name, INITIAL_STOCK);

        //Objects.requireNonNull(name, "Name is required");

        //this.name = name;
        //this.itemsInStock = INITIAL_STOCK;
    }

    Product(String name, int itemsInStock) {
        //Validating arguments
        Objects.requireNonNull(name, "Name is required");
        if (itemsInStock < 0) {
            throw new IllegalArgumentException("Stock must not be negative");
        }


        this.name = name;
        this.itemsInStock = itemsInStock;
    }
}
