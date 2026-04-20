package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public static void greeting(int number) {
        System.out.println("Your choice: " + number + "\n"
                + "\n"
                + "Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
