package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String line;

    public static String userNameScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName  + " !");
        return userName;
    }

    public static String solutionScanner() {
        Scanner scan = new Scanner(System.in);
        line = scan.next();
        return  line;
    }
}
