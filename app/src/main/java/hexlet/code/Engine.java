package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }

    private Engine() {
        System.out.println("Utility class cannot be instantiated");  // NOSONAR
    }

    public static void runGame(String gameRule, String[][] rounds, String playerName) {
        System.out.println(gameRule);  // NOSONAR
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = rounds[i][0];
            String correctAnswer = rounds[i][1];
            System.out.println("Question: " + question); // NOSONAR
            String answer = sc.nextLine();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!"); // NOSONAR
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" // NOSONAR
                        + correctAnswer + "'.\n" + "Let's try again, " + playerName + "!");
                sc.close();
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");  // NOSONAR
        sc.close();
    }
}
