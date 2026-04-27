package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Progression {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int PROGRESSION_LENGTH = 10;
    private static final int NUMBERS_RANGE = 100;


    private Progression() {
        System.out.println("Utility class cannot be instantiated"); // NOSONAR
    }

    public static int[] progressionCalculation(int[] numbers, int number, int step) {

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = (number + step * j);
        }
        return numbers;
    }

    public static void progress(String playerName) {
        int step = 2;
        String[][] rounds = new String[Engine.getRoundsCount()][2];
        String gameRule = "What number is missing in the progression?";
        int[] numbers = new int[PROGRESSION_LENGTH];
        String[] questions = new String[numbers.length];

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int dots = RANDOM.nextInt(PROGRESSION_LENGTH);
            int number = RANDOM.nextInt(NUMBERS_RANGE);
            progressionCalculation(numbers, number, step);

            for (int j = 0; j < numbers.length; j++) {
                if (dots == j) {
                    questions[j] = "..";
                } else {
                    questions[j] = String.valueOf(numbers[j]);
                }
            }
            String question = String.join(" ", questions).trim();
            String correctAnswer = String.valueOf(numbers[dots]);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.runGame(gameRule, rounds, playerName);
    }
}

