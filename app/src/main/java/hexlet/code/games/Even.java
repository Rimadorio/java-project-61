package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

import java.util.Scanner;

public final class Even {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int GAME_NUMBER = 2;

    public static int getGameNumber() {
        return GAME_NUMBER;
    }

    private Even() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void gameEven() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'."); // NOSONAR
        String yesAnswer = "yes";
        String noAnswer = "no";
        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            System.out.print("Question: "); // NOSONAR
            int number = RANDOM.nextInt(0, Integer.MAX_VALUE);
            System.out.println(number); // NOSONAR
            System.out.print("Your answer: "); // NOSONAR
            String answer = sc.next();
            System.out.println(answer); // NOSONAR

            if ((answer.equals(yesAnswer) && number % 2 == 0) || (answer.equals(noAnswer) && number % 2 != 0)) {
                Engine.correct();
            } else {
                if (answer.equals(yesAnswer)) {
                    Engine.evenCondition(yesAnswer, noAnswer);
                    return;
                } else if (answer.equals(noAnswer)) {
                    Engine.evenCondition(noAnswer, yesAnswer);
                    return;
                }
            }

            count++;
            if (count == Engine.getRoundsCount()) {
                Engine.congrats();
            }
        }
    }
}

