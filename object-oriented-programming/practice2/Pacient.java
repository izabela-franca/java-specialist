package practice2;

public class Pacient {

    double weight;
    double height;

    double calculateBmi() {
        double bmi = weight / (height * height);

        return bmi;
    }

}
