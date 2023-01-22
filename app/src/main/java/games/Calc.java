package games;

import hexlet.code.Engine;

public class Calc {
    private static String gameDescription = "What is the result of the expression?\n";
    private static String[] listOfOperators = {"+", "-", "*"};
    private static int number = listOfOperators.length;
    private static int expression(int firstNumber, int secondNumber, String operator) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unexpected operator");
        };
    }
    public static void gameCalc() {
        String randomExpression;
        int firstNumber;
        int secondNumber;
        String[][] dataGame = Engine.dataGame();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            firstNumber = Engine.randomNumber(Engine.MAX_NUMBER);
            secondNumber = Engine.randomNumber(Engine.MAX_NUMBER);
            randomExpression = listOfOperators[Engine.randomNumber(number)];
            dataGame[i][Engine.QUESTION] = firstNumber + " " + randomExpression + " " + secondNumber;
            dataGame[i][Engine.ANSVER] = String.valueOf(expression(firstNumber, secondNumber, randomExpression));
        }
        Engine.launch(dataGame, gameDescription);
    }
}
