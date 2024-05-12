package exercicio1;

import java.util.Arrays;

public class Menu {

    MenuItem[] items = new MenuItem[0];

    void addItem(MenuItem item) {
        this.items = Arrays.copyOf(this.items, this.items.length + 1);
        items[items.length - 1] = item;
    }

    void removeItem(int index) {
        MenuItem[] newItems = new MenuItem[items.length - 1];

        System.arraycopy(items,0,newItems,0,index);
        System.arraycopy(items,index + 1,newItems,index,newItems.length - index);

        items = newItems;

    }

    void printMenuItem(double minPrice, double maxPrice) {
        for (MenuItem item : items) {
            if (item.costsBetween(minPrice, maxPrice)) {
                item.printItems();
            }
        }
    }

}
