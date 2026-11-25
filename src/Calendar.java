import java.util.Scanner;

public class Calendar {
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    public static int daysInMonth(int month, int year) {
        int number_of_days = 0;


        if (month < 1 || month > 12)
            return -1;

        if (month == 2) {
            if (isLeapYear(year))
                number_of_days = 29;
            else
                number_of_days = 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            number_of_days = 31;
        else
            number_of_days = 30;

        return number_of_days;
    }



    public static void test_min() {
        int[] temperatures = {18, 21, 17, 24, 19, 22};
        int minimum = temperatures[0];
        int index = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < minimum) {
                minimum = temperatures[i];
                index = i;
            }
        }
        System.out.printf("niedrigste Temperatur %d an Index %d\n", minimum, index);

    }


    public static void search_and_count() {
        int[] values = {4, 7, 2, 7, 9, 7, 3};
        // int searched_value =
    }

    public static void main(String[] args) {
        test_min();

        for (int i = 1; i <= 12; i++) {
            System.out.println(daysInMonth(i , 2020));
        }
    }
}
