package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;


public final class Even {
    private static final SecureRandom RANDOM = new SecureRandom();

    private Even() {
        System.out.println("Utility class cannot be instantiated");
    }

    public static void gameEven(String playerName) {
        String[][] rounds = new String[Engine.getRoundsCount()][2];
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int number = RANDOM.nextInt(0, Integer.MAX_VALUE);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.runGame(gameRule, rounds, playerName);
    }
}


