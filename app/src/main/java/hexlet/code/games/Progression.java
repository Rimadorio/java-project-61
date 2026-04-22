package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final Random RANDOM = new Random();
    private static final int PROGRESSION_LENGTH = 10;

    public static void progress() {
        Scanner in = new Scanner(System.in);
        int step = 2;
        int count = 0;
        System.out.println("What number is missing in the progression?");
        int[] numbers = new int[PROGRESSION_LENGTH];

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            int dots = RANDOM.nextInt(10);
            int number = RANDOM.nextInt(100);
            System.out.print("Question: ");

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = number + step * j;
                if (j == dots) {
                    numbers[j] = number + step * j;
                    System.out.print(".." + " ");
                } else {
                    System.out.print(numbers[j] + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            int answer = in.nextInt();
            System.out.println(answer);

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

