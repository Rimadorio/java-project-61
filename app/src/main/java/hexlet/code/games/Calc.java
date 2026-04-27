package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;


public final class Calc {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int NUMBERS_RANGE = 1000;


    private Calc() {
        System.out.println("Utility class cannot be instantiated"); // NOSONAR
    }

    public static int expressionResult(char symbol, int firstNumber, int secondNumber) {
        int result;
        if (symbol == '*') {
            result = firstNumber * secondNumber;
        } else if (symbol == '+') {
            result = firstNumber + secondNumber;
        } else {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public static void calculate(String playerName) {
        String[][] rounds = new String[Engine.getRoundsCount()][2];
        String gameRule = "What is the result of the expression?";

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int firstNumber = RANDOM.nextInt(0, NUMBERS_RANGE);
            int secondNumber = RANDOM.nextInt(0, NUMBERS_RANGE);
            char[] symbols = {'+', '-', '*'};
            char randomChar = symbols[RANDOM.nextInt(symbols.length)];
            String question = firstNumber + " " + randomChar + " " + secondNumber;
            String correctAnswer = String.valueOf(expressionResult(randomChar, firstNumber, secondNumber));
            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.runGame(gameRule, rounds, playerName);
    }
}

