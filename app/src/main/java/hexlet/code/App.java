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
                + Even.GAME_NUMBER + " - Even\n"
                + Calc.GAME_NUMBER + " - Calc\n"
                + GCD.GAME_NUMBER + " - GCD\n"
                + Progression.GAME_NUMBER + " - Progression\n"
                + Prime.GAME_NUMBER + " - Prime\n"
                + "0 - Exit");
        Scanner scan = new Scanner(System.in);
        int gameNumber = scan.nextInt();

        switch (gameNumber) {
            case 1:
                Cli.greeting(gameNumber);
                break;
            case Even.GAME_NUMBER:
                Even.gameEven(Cli.greeting(gameNumber));
                break;
            case Calc.GAME_NUMBER:
                Calc.calculate(Cli.greeting(gameNumber));
                break;
            case GCD.GAME_NUMBER:
                GCD.commonDivisor(Cli.greeting(gameNumber));
                break;
            case Progression.GAME_NUMBER:
                Progression.progress(Cli.greeting(gameNumber));
                break;
            case Prime.GAME_NUMBER:
                Prime.primeNumber(Cli.greeting(gameNumber));
                break;
            default:
                break;
        }

        scan.close();
    }
}
