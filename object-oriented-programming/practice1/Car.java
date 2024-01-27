package practice1;

public class Car {

    String manufacturer;
    String model;
    String color;
    int manufactureYear;
    double buyingPrice;
    Owner owner;

    double calculateIpva() {
        if (calculateYearsOfUse() >= 10) {
            return 0;
        }
        return calculateResaleValue() * 0.04;
    }

    int calculateYearsOfUse() {
        return 2024 - manufactureYear;
    }

    double calculateResaleValue() {

        int yearsOfUse = calculateYearsOfUse();
        final var lifeSpan = 20;
        double resalePrice = (buyingPrice / lifeSpan) * (lifeSpan - yearsOfUse);

        if (resalePrice < 0) {
            resalePrice = 0;
        }

        return resalePrice;
    }

}
