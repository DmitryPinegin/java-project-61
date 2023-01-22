package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int MAX_NUMBER = 200;
    public static int randomNumber(int limit) {
        return (int) (Math.random() * limit);
    }
    public static final int ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSVER = 1;
    public static void launch(String[][] dataGame, String gameDescription) {
        int i = 0;
        String playerAnswer;
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String playerName = in.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameDescription);
        while (i < Engine.ROUNDS) {
            System.out.println("Question: " + dataGame[i][QUESTION]);
            System.out.print("Your answer: ");
            playerAnswer = in.nextLine();
            if (playerAnswer.equals(dataGame[i][ANSVER])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '"
                        + dataGame[i][ANSVER] + "'. \nLet's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}

