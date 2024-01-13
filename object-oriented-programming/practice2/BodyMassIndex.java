package practice2;

public class BodyMassIndex {

    double result;
    double weight;
    double height;

    boolean isObese() {
        return result >= 30;
    }

    boolean isUnderweight() {
        return result < 18.5;
    }

}
