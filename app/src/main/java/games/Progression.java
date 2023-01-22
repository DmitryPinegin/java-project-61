package games;
import hexlet.code.Engine;

public class Progression {
    private static String gameDescription = "What number is missing in the progression?\n";
    private static int maxLength = 10;
    private static int firstElement = 10;
    private static int maxStep = 10;
    private static int numberMissingElement = maxLength;

    public static int[] getArithmeticProgression(int element, int stepOfProgression, int lengthOfProgression) {
        int[] arithmeticProgression = new int[lengthOfProgression];
        for (int i = 0; i < lengthOfProgression; i++) {
            if (i == 0) {
                arithmeticProgression[i] = element;
            } else {
                arithmeticProgression[i] = arithmeticProgression[i - 1] + stepOfProgression;
            }
        }
        return arithmeticProgression;
    }

    public static void arithmeticProgression() {
        int firstElem;
        int stepOfProgression;
        String[][] dataGame = new String[Engine.rounds][2];

        for (int j = 0; j < Engine.rounds; j++) {
            firstElem = Engine.randomNumber(firstElement);
            stepOfProgression = Engine.randomNumber(maxStep) + 1;
            int[] arithmeticProgression = getArithmeticProgression(firstElem, stepOfProgression, maxLength);
            int numberOfMissingElement = Engine.randomNumber(numberMissingElement);
            StringBuilder tempElement = new StringBuilder("");
            for (int p = 0; p < maxLength; p++) {
                if (p == numberOfMissingElement) {
                    tempElement.append(".. ");
                } else {
                    tempElement.append(arithmeticProgression[p]);
                    tempElement.append(" ");
                }
            }
            dataGame[j][Engine.question] = tempElement.toString();
            dataGame[j][Engine.answer] = Integer.toString(arithmeticProgression[numberOfMissingElement]);
        }
        Engine.launch(dataGame, gameDescription);
    }
}



