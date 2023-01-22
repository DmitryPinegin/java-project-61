package games;
import hexlet.code.Engine;
import java.math.BigInteger;

public class Prime {
    private static String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";

    public static boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }

    public static void primeNumber() {
        int randomNumber;
        String[][] dataGame = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            randomNumber = Engine.randomNumber(Engine.MAX_NUMBER);
            dataGame[i][Engine.QUESTION] = Integer.toString(randomNumber);
            dataGame[i][Engine.ANSVER] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.launch(dataGame, gameDescription);
    }
}
