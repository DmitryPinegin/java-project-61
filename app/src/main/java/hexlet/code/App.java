package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> {
                    System.out.println("Your choice: " + number);
                    Cli.nameRequest();
                }
                case 2 -> {
                    System.out.println("Your choice: " + number);
                    Even.gameEven();
                }
                case 0 -> {
                    System.out.println("Your choice: " + number + "\nGood Bye !");
                }
                default -> {
                    System.out.println("Value is not valid! Try again!");
                }
            }
        } else {
            System.out.println("Value is not valid! Try again!");
        }
        scanner.close();
    }
}

