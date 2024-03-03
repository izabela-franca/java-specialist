package practice3;

public class CalculateArea {

    public static final double PI = 3.14159265358979323846;

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculareCircleArea(double radius) {
        return radius * radius * CalculateArea.PI;
    }

}
