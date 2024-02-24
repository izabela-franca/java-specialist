package practice6;

import java.util.Arrays;

public class Average {

    //Using VarArgs
    static void calculate( double grade1, double grade2, double... moreGrades) {
        double[] allGrades = Arrays.copyOf(moreGrades, moreGrades.length + 2);
        allGrades[allGrades.length - 2] = grade1;
        allGrades[allGrades.length - 1] = grade2;

        double sum = 0;
        double average = 0;

        for (double grade : allGrades) {
            sum += grade;
        }
        average = sum/ allGrades.length;
        System.out.println(average);
    }
}
