package exercicio2;

public class Main {

    public static void main(String[] args) {
        Menu cardapio = new Menu();

        MenuItem item1 = new MenuItem();
        item1.description = "Rib Eye 500g";
        item1.price = 95;

        MenuItem item2 = new MenuItem();
        item2.description = "Steak 400g";
        item2.price = 102.5;

        MenuItem item3 = new MenuItem();
        item3.description = "French fries 300g";
        item3.price = 12;

        cardapio.addItem(item1);
        cardapio.addItem(item2);
        cardapio.addItem(item3);

        cardapio.printItems(80, 150);

        cardapio.removeItem(0);
        System.out.println("---");

        cardapio.printItems(0, 10);
    }

}
