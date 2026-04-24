package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;


public final class Prime {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int RANGE = 100;
    public static final int GAME_NUMBER = 6;

    private Prime() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }


    public static void primeNumber() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.getRoundsCount()][2];

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int randomNumber = RANDOM.nextInt(RANGE);
            String question = String.valueOf(randomNumber);
            String correctAnswer = isPrime(randomNumber);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.runGame(gameRule, rounds);
    }
}


