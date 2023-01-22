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
        String[][] gameData = new String[Engine.rounds][2];
        for (int i = 0; i < Engine.rounds; i++) {
            firstNumber = Engine.randomNumber(Engine.maxNumber);
            secondNumber = Engine.randomNumber(Engine.maxNumber);
            gameData[i][Engine.question] = firstNumber + " " + secondNumber;
            gameData[i][Engine.answer] = Integer.toString(gcdOfTwoNumbers(firstNumber, secondNumber));
        }
        Engine.launch(gameData, gameDescription);
    }
}
