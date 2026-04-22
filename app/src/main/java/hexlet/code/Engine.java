package hexlet.code;

public final class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }

    private Engine() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + Cli.getName() + "!"); // NOSONAR
    }


    public static void correct() {
        System.out.println("Correct!"); // NOSONAR
    }

    public static void evenCondition(String yesAnswer, String noAnswer) {
        System.out.println("'" + yesAnswer + "' is wrong answer ;(. Correct answer was '" + noAnswer + "'.\n" // NOSONAR
                + "Let's try again, " + Cli.getName());
    }

    public static void calcCondition(int answer, int result) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.\n" // NOSONAR
                + "Let's try again, " + Cli.getName());
    }

}
