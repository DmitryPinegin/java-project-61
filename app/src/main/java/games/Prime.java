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
        String[][] dataGame = new String[Engine.rounds][2];
        for (int i = 0; i < Engine.rounds; i++) {
            randomNumber = Engine.randomNumber(Engine.maxNumber);
            dataGame[i][Engine.question] = Integer.toString(randomNumber);
            dataGame[i][Engine.answer] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.launch(dataGame, gameDescription);
    }
}
