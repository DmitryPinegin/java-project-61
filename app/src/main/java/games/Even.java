package games;

import hexlet.code.Engine;
public class Even {
    private static String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    public static void gameEven() {
        String[][] gameData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Engine.randomNumber(Engine.MAX_NUMBER);
            gameData[i][Engine.QUESTION] = Integer.toString(randomNumber);
            gameData[i][Engine.ANSVER] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.launch(gameData, gameDescription);
    }
}

