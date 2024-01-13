package practice2;

public class Main {

    public static void main(String[] args) {

        BmiCalculator pacient1 = new BmiCalculator();
        Pacient jhon = new Pacient();
        jhon.height = 1.82;
        jhon.weight = 75;

        BodyMassIndex bmi = pacient1.calculate(jhon);

        if (bmi.isObese()) {
            System.out.println("Pacient is obese.");
        }

        System.out.printf("BMI: %.2f\n", bmi.result);
    }
}
