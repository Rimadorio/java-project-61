package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int count = 0;

        for (int i = 0; i < Engine.getRoundsCount(); i++) {
            System.out.println("Question: ");
            String expression = sc.nextLine();
            String[] expressions = expression.split(" ");
            int firstNumber = Integer.parseInt(expressions[0]);
            int secondNumber = Integer.parseInt(expressions[2]);
            int result = 0;

            if (expressions[1].equals("*")) {
                result = firstNumber * secondNumber;
            } else if (expressions[1].equals("+")) {
                result = firstNumber + secondNumber;
            } else if (expressions[1].equals("-")) {
                result = firstNumber - secondNumber;
            }

            System.out.println("Your answer: ");
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
