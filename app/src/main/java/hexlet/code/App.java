package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {

    private static final int GREET_NUMBER = 1;
    private static final int EVEN_NUMBER = 2;
    private static final int CALC_NUMBER = 3;
    private static final int GCD_NUMBER = 4;
    private static final int PROGRESSION_NUMBER = 5;
    private static final int PRIME_NUMBER = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" // NOSONAR
                + GREET_NUMBER + " - Greet\n"
                + EVEN_NUMBER + " - Even\n"
                + CALC_NUMBER + " - Calc\n"
                + GCD_NUMBER + " - GCD\n"
                + PROGRESSION_NUMBER + " - Progression\n"
                + PRIME_NUMBER + " - Prime\n"
                + "0 - Exit");
        Scanner scan = new Scanner(System.in);
        int gameNumber = scan.nextInt();

        switch (gameNumber) {
            case GREET_NUMBER:
                Cli.greeting(gameNumber);
                break;
            case EVEN_NUMBER:
                Even.gameEven(Cli.greeting(gameNumber));
                break;
            case CALC_NUMBER:
                Calc.calculate(Cli.greeting(gameNumber));
                break;
            case GCD_NUMBER:
                GCD.commonDivisor(Cli.greeting(gameNumber));
                break;
            case PROGRESSION_NUMBER:
                Progression.progress(Cli.greeting(gameNumber));
                break;
            case PRIME_NUMBER:
                Prime.primeNumber(Cli.greeting(gameNumber));
                break;
            default:
                System.out.println("Your choice is 0. Exiting Brain games."); // NOSONAR
                break;
        }

        scan.close();
    }
}
