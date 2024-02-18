package exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    ArrayList<MenuItem> itens = new ArrayList<>();

    void addItem(MenuItem item) {
        itens.add(item);
    }

    void removeItem(int index) {
        itens.remove(index);
    }

    void printItems(double precoMinimo, double precoMaximo) {
        for (MenuItem item : itens) {
            if (item.hasPriceBetween(precoMinimo, precoMaximo)) {
                item.printList();
            }
        }
    }
}
