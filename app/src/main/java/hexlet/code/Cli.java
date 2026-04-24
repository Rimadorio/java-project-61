package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private Cli() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static String greeting(int number) {
        System.out.println("Your choice: " + number + "\n" // NOSONAR
                + "\n"
                + "Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? "); // NOSONAR
        String name = scanner.nextLine();
        System.out.println(name); // NOSONAR
        System.out.println("Hello, " + name + "!"); // NOSONAR
        return name;
    }
}


