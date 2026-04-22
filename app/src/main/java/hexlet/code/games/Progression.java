package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Progression {
    private static final Random RANDOM = new Random();
    private static final int PROGRESSION_LENGTH = 10;
    private static final int NUMBERS_RANGE = 100;
    private static final int GAME_NUMBER = 5;

    public static int getGameNumber() {
        return GAME_NUMBER;
    }

    private Progression() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void progress() {
        Scanner in = new Scanner(System.in);
        int step = 2;
        int count = 0;
        System.out.println("What number is missing in the progression?"); // NOSONAR
        int[] numbers = new int[PROGRESSION_LENGTH];

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int dots = RANDOM.nextInt(PROGRESSION_LENGTH);
            int number = RANDOM.nextInt(NUMBERS_RANGE);
            System.out.print("Question: "); // NOSONAR

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = number + step * j;
                if (j == dots) {
                    numbers[j] = number + step * j;
                    System.out.print(".." + " "); // NOSONAR
                } else {
                    System.out.print(numbers[j] + " "); // NOSONAR
                }
            }
            System.out.println(); // NOSONAR
            System.out.print("Your answer: "); // NOSONAR
            int answer = in.nextInt();
            System.out.println(answer); // NOSONAR

            if (answer == numbers[dots]) {
                Engine.correct();
                count++;
            } else {
                Engine.calcCondition(answer, numbers[dots]);
                return;
            }

            if (count == Engine.getRoundsCount()) {
                Engine.congrats();
            }
        }
    }
}

