package practice1;

public class Main {

    public static void main(String[] args) {

        //Wrappers
        Client client = new Client();
        client.age = Integer.valueOf(20);
        System.out.printf("Age: %d\n", client.age);

        // Extracting
        Integer number = Integer.valueOf(10);
        short numberShort = number.shortValue();
        Short numberShortWrapper = Short.valueOf(number.shortValue());

        System.out.println(numberShort);
        System.out.println(numberShortWrapper);

        //Autoboxing
        Integer number2 = 5;
        System.out.println(number2);

        //Unboxing
        int numberInt = number2;
        System.out.println(number2);
    }
}
