import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        System.out.println(Math.random());

        Scanner input = new Scanner(System.in);

        int rand_number = (int) (Math.random() * 101.0f);

        int number_of_guess = 0;
        while (number_of_guess < 10) {
            System.out.print("Welche Zahl vermuten Sie? - ");
            int guess_number = input.nextInt();
            if (guess_number == rand_number) {
                System.out.printf("Sie haben die richtige Zahl %d gefunden :)\n", guess_number);
                System.out.printf("Sie haben %d Versuche gebraucht  !!!\n", number_of_guess);
                break;
            } else if (guess_number < rand_number) {
                System.out.println("Ihre Zahl ist leider zu klein :(\n");
            } else {
                System.out.println("Ihre Zahl ist leider zu groß :(\n");
            }
            number_of_guess++;
        }
    }
}
/*
* boolean isEven(int)
* double findMaximum(double, double)
* double calculateNetto(double, double)
* boolean isYear(int)
* double abs(double)
* */