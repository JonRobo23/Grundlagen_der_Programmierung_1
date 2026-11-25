import java.util.Scanner;

public class GradeCalculator {
    public static double readGrade(Scanner input) {
        return input.nextDouble();
    }
    public static double calculateAverage(double sum, int number_of_grades) {
        return sum / ((double) number_of_grades);
    }

    public static double calculateGrade(double average) {
        return ((int) (average * 3 + 0.5)) / 3.0;
    }

    public static void printResult(double grade) {
        System.out.printf("Du hast einen Notendurchschnitt von %.1f", grade);
    }


    // now calculate average with arrays
    public static void test_array() {
        int[] grades = {2, 1, 3, 2, 4, 1};

        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }


        double average = (sum * 1.0) / grades.length;
        System.out.printf("Die Notensumme beträgt %d mit dem Durchschnitt %f\n", sum, average);
    }

    public static void main(String[] args) {
        test_array();
        return;


/*

        Scanner input = new Scanner(System.in);
        System.out.print("Wie viele Noten wollen Sie eingeben? - ");
        int number_of_grades = input.nextInt();

        double sum_of_grades = 0;
        for (int i = 0; i < number_of_grades; i++) {
            System.out.printf("Geben Sie die Zahl %d/%d ein - ", i + 1, number_of_grades);
            double grade = readGrade(input);
            sum_of_grades += grade;
        }
        double average_grade = calculateAverage(sum_of_grades, number_of_grades);
        double correct_grade = calculateGrade(average_grade);
        printResult(correct_grade);
        */

    }
}
