package practice3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Copying arrays
        int[] numbersOriginal = {1, 2, 3, 4, 5, 6, 7};

        int[] numbersCopy1 = Arrays.copyOf(numbersOriginal, 4);
        System.out.println(Arrays.toString(numbersCopy1));

        int[] numbersCopy2 = Arrays.copyOf(numbersOriginal, numbersOriginal.length);
        System.out.println(Arrays.toString(numbersCopy2));

        //Expanding arrays
        int[] numbersCopy3 = Arrays.copyOf(numbersOriginal, numbersOriginal.length + 1);
        System.out.println(Arrays.toString(numbersCopy3));

        int[] numbersCopy4 = Arrays.copyOf(numbersOriginal,10);
        System.out.println(Arrays.toString(numbersCopy4));
    }

}
