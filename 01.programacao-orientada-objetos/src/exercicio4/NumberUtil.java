package exercicio4;

public class NumberUtil {

    static int compare(int a, int b) {
        return a > b ? a : b;
    }

    static int compare(int a, int b, int c) {
        return compare(compare(a, b), c);
    }

    static double compare(double a, double b) {
        return a > b ? a : b;
    }

    static double compare(double a, double b, double c) {
        return compare(compare(a, b), c);
    }

}
