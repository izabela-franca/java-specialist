package practice3;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 7, 4, 9, 2, 8};
        int[] newNumbers = new int[numbers.length - 1];

        int indexToBeRemoved = 4;

        //Copying arrays via "arraycopy"
        System.arraycopy(numbers,0,newNumbers,0,indexToBeRemoved);
        System.arraycopy(numbers,indexToBeRemoved + 1,newNumbers,indexToBeRemoved,newNumbers.length - indexToBeRemoved); //"removing" number


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newNumbers));
    }
}
