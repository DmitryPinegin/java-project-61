package games;
import hexlet.code.Engine;

public class Progression {
    private static String gameDescription = "What number is missing in the progression?\n";
    private static final int MAX_LENGTH = 10;
    private static final int FIRST_ELEMENT = 10;
    private static final int MAX_STEP = 10;
    private static int numberMissingElement = MAX_LENGTH;

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
        String[][] dataGame = new String[Engine.ROUNDS][2];

        for (int j = 0; j < Engine.ROUNDS; j++) {
            firstElem = Engine.randomNumber(FIRST_ELEMENT);
            stepOfProgression = Engine.randomNumber(MAX_STEP) + 1;
            int[] arithmeticProgression = getArithmeticProgression(firstElem, stepOfProgression, MAX_LENGTH);
            int numberOfMissingElement = Engine.randomNumber(numberMissingElement);
            StringBuilder tempElement = new StringBuilder("");
            for (int p = 0; p < MAX_LENGTH; p++) {
                if (p == numberOfMissingElement) {
                    tempElement.append(".. ");
                } else {
                    tempElement.append(arithmeticProgression[p]);
                    tempElement.append(" ");
                }
            }
            dataGame[j][Engine.QUESTION] = tempElement.toString();
            dataGame[j][Engine.ANSVER] = Integer.toString(arithmeticProgression[numberOfMissingElement]);
        }
        Engine.launch(dataGame, gameDescription);
    }
}



