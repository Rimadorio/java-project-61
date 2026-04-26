package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Progression {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int PROGRESSION_LENGTH = 10;
    private static final int NUMBERS_RANGE = 100;
    public static final int GAME_NUMBER = 5;

    private Progression() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static String progressionCalculation(String[] numbers, int number, int step, int dots) {

        for (int j = 0; j < numbers.length; j++) {
            if (j == dots) {
                numbers[j] = ".." + " ";
            } else {
                numbers[j] = (number + step * j) + " ";
            }
        }
        return String.join("", numbers);

    }

    public static String progressionAnswer(String[] numbers, int number, int step, int dots) {
        String answer = null;
        for (int j = 0; j < numbers.length; j++) {
            if (j == dots) {
                numbers[j] = (number + step * j) + " ";
                answer = numbers[j].trim();
            } else {
                numbers[j] = (number + step * j) + " ";
            }
        }
        return answer;
    }


    public static void progress(String playerName) {
        int step = 2;
        String[][] rounds = new String[Engine.getRoundsCount()][2];
        String gameRule = "What number is missing in the progression?";
        String[] numbers = new String[PROGRESSION_LENGTH];

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int dots = RANDOM.nextInt(PROGRESSION_LENGTH);
            int number = RANDOM.nextInt(NUMBERS_RANGE);
            String correctAnswer = progressionAnswer(numbers, number, step, dots);
            String question = progressionCalculation(numbers, number, step, dots);


            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.runGame(gameRule, rounds, playerName);
    }
}

