package pratica1;

public class Calculator {

    static double calculateAverage(int[] numbers) {
        int total = 0;

        //Loop through an array: Option 1
//        for (int i = 0; i < numbers.length; i++) {
//            total += numbers[i];
//        }

        //Loop through an array: Option 2
        for (int number : numbers) {
            total += number;
        }


        return (double) total / numbers.length;
    }
}
