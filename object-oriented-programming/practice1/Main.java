package practice1;

public class Main {

    public static void main(String[] args) {

        //Working with Objects
        Owner owner1 = new Owner();
        owner1.name = "Izabela";
        owner1.cpf = "123.456.789-10";

        Car car1 = new Car();
        car1.manufacturer = "Honda";
        car1.model = "Corola";
        car1.color = "white";
        car1.manufactureYear = 2021;
        car1.buyingPrice = 150000;
        car1.owner = owner1;

        Car car2 = new Car();
        car2.manufacturer = "Honda";
        car2.model = "HR-V";
        car2.color = "gray";
        car2.manufactureYear = 2020;
        car2.buyingPrice = 120000;

        System.out.println("Model:" + car1.model);
        System.out.println("Year: " + car1.manufactureYear);
        System.out.println("Owner: " + car1.owner.name);

        System.out.println("-----------------------");

        System.out.println("Model:" + car2.model);
        System.out.println("Year: " + car2.manufactureYear);

        System.out.println("-----------------------");

        //Working with methods
        System.out.println(car1.calculateResaleValue());
    }
}
