import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie bitte eine ganze Zahl ein - ");
        int number =  input.nextInt();
        int number_of_digits = 0;
        int sum_of_digits = 0;
        int max_digit = 0;

        int copy_of_number = number;
        int reversed_number = 0;

        while(copy_of_number > 0) {
            number_of_digits++;

            int digit = copy_of_number % 10;
            sum_of_digits += digit;

            if (digit > max_digit)
                max_digit = digit;

            reversed_number *= 10;
            reversed_number += digit;

            copy_of_number /= 10;
        }

        System.out.printf("Die Zahl %d hat %d Stellen, deren Summe %d ist.\n Die größte Ziffer ist %d\n", number, number_of_digits, sum_of_digits, max_digit);
        if (reversed_number == number) {
            System.out.println("Die Zahl ist ein Palindrom");
        } else {
            System.out.println("Die Zahl ist kein Palindrom");
        }
    }
}
