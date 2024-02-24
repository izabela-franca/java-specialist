package exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    ArrayList<MenuItem> items = new ArrayList<>();

    void addItem(MenuItem item) {
        items.add(item);
    }

    void removeItem(int index) {
        items.remove(index);
    }

    ArrayList<MenuItem> printItems(double precoMinimo, double precoMaximo) {

        ArrayList<MenuItem> itemsFound = new ArrayList<>();

        for (MenuItem item : items) {
            if (item.hasPriceBetween(precoMinimo, precoMaximo)) {
                item.printList();
            }
        }

        return itemsFound;
    }
}
