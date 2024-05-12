package pratica1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Initializing arrays
        int[] grades1 = new int[5];
        int[] grades2 = {8, 5, 4, 9, 10};

        double average = Calculator.calculateAverage(grades2);
        System.out.println(average);

        //Arrays To String
        System.out.println(Arrays.toString(grades2));

        //Sorting arrays
        Arrays.sort(grades2);
        System.out.println(Arrays.toString(grades2));
    }
}
