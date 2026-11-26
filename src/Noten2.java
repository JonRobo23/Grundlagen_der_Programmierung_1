import java.util.HashMap;
import java.util.Scanner;


public class Noten2 {
    public static void saveGrade() {

    }

    public static int getMode(Scanner input) {
        System.out.println("Was wollen Sie machen? ");
        System.out.println("0 - Beendet das Programm");
        System.out.println("1 - Speichert eine Note");
        System.out.println("2 - Note von einem Studierenden abrufen");
        System.out.println("3 - Prüfen, ob eine Matrikelnummer existiert");
        System.out.println("4 - Eine Note ändern");
        System.out.println("5 - einen Studierenden entfernen");
        return input.nextInt();
    }

    public static String get_id(Scanner input) {
        System.out.print("Wie lautet ihre Matrikelnummer? - ");
        input.nextLine();
        return input.nextLine();
    }

    public static double get_grade(Scanner input) {
        System.out.print("Wie lautet die Note? - ");
        return input.nextDouble();
    }

    public static void print_grades(HashMap<String, Double> grades) {
        // for (int i = 0; i <)a

    }


    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();
        Scanner input = new Scanner(System.in);

        boolean isEnd = false;
        while (!isEnd) {
            System.out.println(grades);
            int mode = getMode(input);

            if (mode == 0) {
                isEnd = true;
            } else if (mode == 1 || mode == 4) {
                String id = get_id(input);
                double grade = get_grade(input);
                grades.put(id, grade);
            } else if (mode == 2) {
                String id = get_id(input);
                System.out.printf("Die Note beträgt %f\n", grades.get(id));
            } else if (mode == 3) {
                String id = get_id(input);
                if (grades.containsKey(id)) {
                    System.out.println("Ja, die Matrikelnummer existiert");
                } else {
                    System.out.println("Nein, die Matrikelnummer existiert nicht");
                }
            } else if (mode == 5) {
                String id = get_id(input);
                grades.remove(id);
            }
        }

        System.out.printf("%f\n", grades.get("Student1"));
    }
}
