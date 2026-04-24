package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class GCD {
    public static final int GAME_NUMBER = 4;
    private static final SecureRandom RANDOM = new SecureRandom();

    private GCD() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static int gcdCalculation(int firstNumber, int secondNumber) {
        int temp;
        while (secondNumber != 0) {
            temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static void commonDivisor() {
        String[][] rounds = new String[Engine.getRoundsCount()][2];
        String gameRule = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.getRoundsCount(); i++) {

            int firstNumber = RANDOM.nextInt(0, Integer.MAX_VALUE);
            int secondNumber = RANDOM.nextInt(0, Integer.MAX_VALUE);
            String question = firstNumber + " " + secondNumber;
            String correctAnswer = String.valueOf(gcdCalculation(firstNumber, secondNumber));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.runGame(gameRule, rounds);
    }
}



