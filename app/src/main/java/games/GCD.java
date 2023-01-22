package games;
import hexlet.code.Engine;

public class GCD {
    private static String gameDescription = "Find the greatest common divisor of given numbers.\n";

    private static int gcdOfTwoNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return gcdOfTwoNumbers(secondNumber, firstNumber % secondNumber);
    }

    public static void greatestCommonDivisor() {
        int firstNumber;
        int secondNumber;
        String[][] gameData = Engine.dataGame();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            firstNumber = Engine.randomNumber(Engine.MAX_NUMBER);
            secondNumber = Engine.randomNumber(Engine.MAX_NUMBER);
            gameData[i][Engine.QUESTION] = firstNumber + " " + secondNumber;
            gameData[i][Engine.ANSVER] = Integer.toString(gcdOfTwoNumbers(firstNumber, secondNumber));
        }
        Engine.launch(gameData, gameDescription);
    }
}
