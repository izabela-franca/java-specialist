package practice1;

public class Car {

    String manufacturer;
    String model;
    String color;
    int manufactureYear;
    double buyingPrice;
    Owner owner;

    void calculateResaleValue(int currentYear) {

        int yearsOfUse = currentYear- manufactureYear;
        var lifeSpan = 20;
        double resalePrice = (buyingPrice / lifeSpan) * (lifeSpan - yearsOfUse);

        if (resalePrice < 0) {
            resalePrice = 0;
        }

        System.out.printf("Resale price: %.2f", resalePrice);
    }

}
