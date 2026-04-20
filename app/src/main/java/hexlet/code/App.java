package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
        Scanner scan = new Scanner(System.in);
        int gameNumber = scan.nextInt();

        if (gameNumber == 1) {
            Cli.greeting(gameNumber);
        }

        if (gameNumber == 2) {
            Cli.greeting(gameNumber);
            Even.gameEven();
        }

        if (gameNumber == 3) {
            Cli.greeting(gameNumber);
            Calc.calculate();
        }

        scan.close();
    }
}
