package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        int a = 1;
        int b = 100;
        int[] randomNumbers = new int[3];
        randomNumbers[0] = a + (int) (Math.random() * b);
        randomNumbers[1] = a + (int) (Math.random() * b);
        randomNumbers[2] = a + (int) (Math.random() * b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();

        System.out.println("Hello, " + userName  + " !");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < randomNumbers.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Question: " + randomNumbers[i]);
            String line = scan.next();

            if (i == 2 && randomNumbers[i] % 2 == 0 && line.equals("yes")) {
                System.out.println("Your answer: yes\nCorrect!");
                System.out.println("Congratulations, " + userName + " !");
            } else if (i == 2 && randomNumbers[i] % 2 == 0 && !line.equals("yes")) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + userName + " !");
            } else if (i == 2 && randomNumbers[i] % 2 != 0 && line.equals("no")) {
                System.out.println("Your answer: no\nCorrect!");
                System.out.println("Congratulations, " + userName + " !");
            } else if (i == 2 && randomNumbers[i] % 2 != 0 && !line.equals("no")) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName + " !");
            } else if (randomNumbers[i] % 2 == 0 && line.equals("yes")) {

                System.out.println("Your answer: yes\nCorrect!");
            } else if (randomNumbers[i] % 2 == 0 && !line.equals("yes")) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + userName + " !");
                break;
            } else if (randomNumbers[i] % 2 != 0 && line.equals("no")) {
                System.out.println("Your answer: no\nCorrect!");
            } else if (randomNumbers[i] % 2 != 0 && !line.equals("no")) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName + " !");
                break;
            }
        }
    }
}
