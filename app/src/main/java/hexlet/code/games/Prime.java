package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final Random RANDOM = new Random();
    private static final int DIVIDE_NUMBER = 3;
    private static final int RANGE = 100;
    private static final int GAME_NUMBER = 6;

    public static int getGameNumber() {
        return GAME_NUMBER;
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            return number % 2 != 0 && number % DIVIDE_NUMBER != 0;
        }
    }

    public static void primeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int count = 0;

        for (int i = 0; i < Engine.getRoundsCount(); i++) {

            System.out.print("Question: ");
            int randomNumber = RANDOM.nextInt(RANGE);
            System.out.println(randomNumber);

            System.out.print("Your answer: ");
            String answer = input.nextLine();
            System.out.println();
            if (answer.equals("yes") && isPrime(randomNumber)
                    || answer.equals("no") && !isPrime(randomNumber)) {
                Engine.correct();
                count++;
            } else {
                if (answer.equals("yes") && !isPrime(randomNumber)) {
                    Engine.evenCondition(answer, "no");
                    return;
                } else if (answer.equals("no") && isPrime(randomNumber)) {
                    Engine.evenCondition(answer, "yes");
                    return;
                }
            }
        }

        if (count == Engine.getRoundsCount()) {
            Engine.congrats();
        }
    }

}


