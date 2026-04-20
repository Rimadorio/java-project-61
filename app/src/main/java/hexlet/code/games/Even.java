package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static void gameEven() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String yesAnswer = "yes";
        String noAnswer = "no";
        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            System.out.print("Question: ");
            int number = sc.nextInt();
            System.out.println(number);
            System.out.print("Your answer: ");
            String answer = sc.next();
            System.out.println(answer);

            if ((answer.equals(yesAnswer) && number % 2 == 0) || (answer.equals(noAnswer) && number % 2 != 0)) {
                Engine.correct();
            } else {
                if ((answer.equals(yesAnswer) && number % 2 != 0)) {
                    Engine.evenCondition(yesAnswer, noAnswer);
                    return;
                } else if ((answer.equals(noAnswer) && number % 2 == 0)) {
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

