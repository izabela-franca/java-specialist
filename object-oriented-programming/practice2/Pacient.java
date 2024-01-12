package practice2;

public class Pacient {

    double weight;
    double height;

    BodyMassIndex calculateBmi() {
        BodyMassIndex bmi = new BodyMassIndex();
        bmi.result = weight / (height * height);;
        bmi.weight = weight;
        bmi.height = height;

        return bmi;
    }

}
