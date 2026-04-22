package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    private static final int GAME_NUMBER = 4;

    public static int getGameNumber() {
        return GAME_NUMBER;
    }
    public static void commonDivisor() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int temp = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            System.out.println("Question: ");
            String expression = sc.nextLine();
            String[] expressions = expression.split(" ");
            int firstNumber = Integer.parseInt(expressions[0]);
            int secondNumber = Integer.parseInt(expressions[1]);

            while (secondNumber != 0) {
                temp = secondNumber;
                secondNumber = firstNumber % secondNumber;
                firstNumber = temp;
            }

            System.out.println("Your answer: ");
            int answer = Integer.parseInt(sc.nextLine());

            if (answer == firstNumber) {
                Engine.correct();
                count++;
            } else {
                Engine.calcCondition(answer, firstNumber);
                return;
            }

            if (count == Engine.getRoundsCount()) {
                Engine.congrats();
            }

        }

    }
}



