package hexlet.code;
import java.util.Scanner;
public class Cli {

    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("May I have your name? "+name+"\n"+"Hello, "+name+"!");


    }
}
