package exercicio1;

public class Main {
    public static void main(String[] args) {

        System.out.println(Calendar.getMonthName(2));


        System.out.println("------------------------------------");


        Menu menu = new Menu();

        MenuItem item1 = new MenuItem();
        item1.description = "Rib Eye 500g";
        item1.price = 95;

        MenuItem item2 = new MenuItem();
        item2.description = "Steak 400g";
        item2.price = 102.5;

        MenuItem item3 = new MenuItem();
        item3.description = "French fries 300g";
        item3.price = 12;

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        menu.printMenuItem(80, 150);

        menu.removeItem(0);
        System.out.println("---");

        menu.printMenuItem(0, 150);
    }
}
