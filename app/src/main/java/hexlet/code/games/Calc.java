package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Scanner;

public final class Calc {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int GAME_NUMBER = 3;

    public static int getGameNumber() {
        return GAME_NUMBER;
    }
    private Calc() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?"); // NOSONAR
        int count = 0;

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            System.out.print("Question: "); // NOSONAR

            int firstNumber = RANDOM.nextInt();
            int secondNumber = RANDOM.nextInt();
            char [] symbols = {'+', '-', '*'};
            char randomChar = symbols[RANDOM.nextInt(symbols.length)];
            int result;

            if (randomChar == '*') {
                result = firstNumber * secondNumber;
            } else if (randomChar == '+') {
                result = firstNumber + secondNumber;
            } else {
                result = firstNumber - secondNumber;
            }
            System.out.println(firstNumber + " " + randomChar + " " + secondNumber);// NOSONAR
            System.out.println("Your answer: "); // NOSONAR
            int answer = Integer.parseInt(sc.nextLine());
            if (answer == result) {
                Engine.correct();
                count++;
            } else {
                Engine.calcCondition(answer, result);
                return;
            }
        }

        if (count == Engine.getRoundsCount()) {
            Engine.congrats();
        }

    }
}
