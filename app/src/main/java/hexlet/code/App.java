package hexlet.code;

import games.Even;
import games.Calc;
import games.Progression;
import games.Prime;
import games.GCD;
import java.util.Scanner;
public class App {
    private static final int EXIT = 0;
    private static final int GREETING = 1;
    private static final int GAME_EVEN_NUMBERS = 2;
    private static final int GAME_CALCULATOR = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_ARITHMETIC_PROGRESSION = 5;
    private static final int GAME_PRIME_NUMBER = 6;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet\s
                 2 - Even\s
                 3 - Calc\s
                 4 - GCD\s
                 5 - Progression\s
                 6 - Prime\s
                 0 - Exit""");
        int gameNumber = in.nextInt();
        System.out.println("Your choice: " + gameNumber + "\n");

        switch (gameNumber) {
            case EXIT:
                System.out.println("Your choice: " + 0 + "\nGood Bye !");
                return;
            case GREETING:
                Cli.nameRequest();
                break;
            case GAME_EVEN_NUMBERS:
                Even.gameEven();
                break;
            case GAME_CALCULATOR:
                Calc.gameCalc();
                break;
            case GAME_GCD:
                GCD.greatestCommonDivisor();
                break;
            case GAME_ARITHMETIC_PROGRESSION:
                Progression.arithmeticProgression();
                break;
            case GAME_PRIME_NUMBER:
                Prime.primeNumber();
                break;
            default:
                System.out.println("There is no such game, sorry.");
        }
    }
}

