package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" // NOSONAR
                + "1 - Greet\n"
                + Even.getGameNumber() + " - Even\n"
                + Calc.getGameNumber() + " - Calc\n"
                + GCD.getGameNumber() + " - GCD\n"
                + Progression.getGameNumber() + " - Progression\n"
                + Prime.getGameNumber() + " - Prime\n"
                + "0 - Exit");
        Scanner scan = new Scanner(System.in);
        int gameNumber = scan.nextInt();
        Cli.greeting(gameNumber);

        if (gameNumber == Even.getGameNumber()) {
            Even.gameEven();
        }

        if (gameNumber == Calc.getGameNumber()) {
            Calc.calculate();
        }

        if (gameNumber == GCD.getGameNumber()) {
            GCD.commonDivisor();
        }

        if (gameNumber == Progression.getGameNumber()) {
            Progression.progress();
        }

        if (gameNumber == Prime.getGameNumber()) {
            Prime.primeNumber();
        }
        scan.close();
    }
}
