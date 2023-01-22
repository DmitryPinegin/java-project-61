package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String line;

    public static String userNameScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName  + "!");
        return userName;
    }

    public static String solutionScanner() {
        Scanner scan = new Scanner(System.in);
        line = scan.next();
        return  line;
    }
    public static int[] randomNumbers() {
        Random random = new Random();
        int[] randomNumbers = new int[6];
        randomNumbers[0] = random.nextInt(100);
        randomNumbers[1] = random.nextInt(100);
        randomNumbers[2] = random.nextInt(100);
        randomNumbers[3] = random.nextInt(100);
        randomNumbers[4] = random.nextInt(100);
        randomNumbers[5] = random.nextInt(100);
        return randomNumbers;
    }
}
