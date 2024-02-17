package exercise1;

public class Calendar {

    static String getMonthName(int monthNumber) {
        String[] monthNames = {"January", "February","March","April","May","June","July","August","September",
                "October","November","December"};

        return monthNames[monthNumber - 1];
    }
}
