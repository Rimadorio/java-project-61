package hexlet.code;

public class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }

    public static void congrats() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static void incorrect() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static void correct() {
        System.out.println("Correct!");
    }

    public static void evenCondition(String yesAnswer, String noAnswer) {
        System.out.println("'" + yesAnswer + "' is wrong answer ;(. Correct answer was '" + noAnswer + "'.\n"
                + "Let's try again, " + Cli.getName());
    }

    public static void calcCondition(int answer, int result) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.\n"
                + "Let's try again, " + Cli.getName());
    }

}
