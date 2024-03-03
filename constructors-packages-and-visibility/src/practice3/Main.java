package practice3;

import static practice3.CalculateArea.PI;
import static practice3.CalculateArea.calculateSquareArea;

public class Main {

    public static void main(String[] args) {

                            //static import
        double areaQuadrado = calculateSquareArea (5.2);
                            //common import
        double areaCirculo = CalculateArea.calculareCircleArea(10.5);


        System.out.printf("PI: %.2f%n", PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }

}
