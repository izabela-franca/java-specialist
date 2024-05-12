package pratica2;

public class BmiCalculator {
    //Using Objects as arguments and as return
    BodyMassIndex calculate(Pacient pacient ) {
        BodyMassIndex bmi = new BodyMassIndex();
        bmi.result = pacient.weight / (pacient.height * pacient.height);;
        bmi.weight = pacient.weight;
        bmi.height = pacient.height;

        return bmi;
    }

}
