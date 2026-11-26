import java.util.Scanner;
import java.util.ArrayList;


public class Task {

    public static int getMode(Scanner input) {
        System.out.println("Welche Aufgabe wollen Sie machen ?");
        System.out.println("0 - beendet das Programm");
        System.out.println("1 - Fügt eine Aufgabe hinzu");
        System.out.println("2 - Entfernt eine Ausagabe");
        System.out.println("3 - Schaut, ob eine Ausgabe existiert");
        System.out.println("4 - Ersetzt eine bestehende Aufgabe durch eine neue");
        return input.nextInt();
    }

    public static String getTaskName(Scanner input) {
        System.out.println("Wie soll ihre Aufgabe heißen? - ");
        String dumm = input.nextLine();

        return input.nextLine();
    }

    public static int getTaskID(Scanner input) {
        System.out.print("Welchen Index hat ihre Aufgabe? - ");
        return input.nextInt();
    }

    public static void printTasks(ArrayList<String> tasks) {
        System.out.printf("Sie haben %d Aufgaben:\n", tasks.size());
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d - %s\n", i, tasks.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        boolean isEnd = false;
        while (!isEnd) {
            printTasks(tasks);
            int mode = getMode(input);

            if (mode == 0) {
                isEnd = true;
            } else if (mode == 1) {
                String name = getTaskName(input);
                tasks.add(name);

            } else if (mode == 2) {
                tasks.remove(getTaskID(input));
            } else if (mode == 3) {
                if (tasks.contains(getTaskName(input))) {
                    System.out.println("Ihre Task existiert in der Liste");
                } else {
                    System.out.println("Ihre Task existiert nicht in der Liste");
                }
            } else if (mode == 4) {
                int index = getTaskID(input);
                String name = getTaskName(input);
                tasks.set(index, name);
            }
        }
    }
}
