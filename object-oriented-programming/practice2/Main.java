package practice2;

public class Main {

    public static void main(String[] args) {

        Pacient pacient1 = new Pacient();
        pacient1.height = 1.82;
        pacient1.weight = 75;

        BodyMassIndex bmi = pacient1.calculateBmi();

        System.out.printf("BMI: %.2f\n", bmi.result);
    }
}
