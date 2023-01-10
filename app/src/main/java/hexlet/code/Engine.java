package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String line;
//    public static int result;

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
//    public static int randomNumber() {
//        Random random = new Random();
//        int result = 1;
//
////        for(int i = 1; i < 100; i++){
////            result += random.nextInt();
////        }
//        return result;
////        int a = 1;
////        int b = 100;
////        randomNumber= (int) (a + Math.random() * b);
////        return randomNumber;
//
//    }
}
