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
        System.out.print("May I have your name? "); // NOSONAR

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        System.out.println(playerName); // NOSONAR
        System.out.println("Hello, " + playerName + "!"); // NOSONAR

        return playerName;
    }
}


