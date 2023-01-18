package games;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;
import static hexlet.code.Engine.line;
import static hexlet.code.Engine.userName;
public class GCD {
    public static void greatestCommonDivisor() {
        Engine.userNameScanner();
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        int[] randomNumbers = new int[6];
        randomNumbers[0] = random.nextInt(100);
        randomNumbers[1] = random.nextInt(100);
        randomNumbers[2] = random.nextInt(100);
        randomNumbers[3] = random.nextInt(100);
        randomNumbers[4] = random.nextInt(100);
        randomNumbers[5] = random.nextInt(100);
        int gcd = 1;
        for (var s = 0; s <= randomNumbers.length; s++) {
            if (s == 0) {
                System.out.println("Question: " + randomNumbers[0] + " " + randomNumbers[1]);
                int n1 = randomNumbers[0];
                int n2 = randomNumbers[1];
                for (int i = 1; i <= n1 && i <= n2; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        gcd = i;
                    }
                }
            } else if (s == 3) {
                System.out.println("Question: " + randomNumbers[2] + " " + randomNumbers[3]);
                int n1 = randomNumbers[2];
                int n2 = randomNumbers[3];
                for (int i = 1; i <= n1 && i <= n2; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        gcd = i;
                    }
                }
            } else if (s == 6) {
                System.out.println("Question: " + randomNumbers[4] + " " + randomNumbers[5]);
                int n1 = randomNumbers[4];
                int n2 = randomNumbers[5];
                for (int i = 1; i <= n1 && i <= n2; i++) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        gcd = i;
                    }
                }
            }
            Engine.solutionScanner();
            int i1 = NumberUtils.toInt(line);
            if (i1 == 0) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + gcd + ".\nLet's try again, " + userName + " !");
                break;
            }
            if (s == 6 && gcd == i1) {
                System.out.println("Your answer: " + i1 + "\nCorrect!");
                System.out.println("Congratulations, " + userName + " !");
            } else if (gcd == i1) {
                System.out.println("Your answer: " + i1 + "\nCorrect!");
                s = s + 2;
            } else if (gcd != i1 && s == 0) {
                System.out.println("'" + i1 + "'" + " is wrong answer ;(. Correct answer was " + gcd + ".\nLet's try again, " + userName + " !");
                break;
            } else if (gcd != i1 && s == 3) {
                System.out.println("'" + i1 + "'" + " is wrong answer ;(. Correct answer was " + gcd + ".\n"
                        + "Let's try again, " + userName + " !");
                break;
            } else if (gcd != i1 && s == 6) {
                System.out.println("'" + i1 + "'" + " is wrong answer ;(. Correct answer was " + gcd + ".\nLet's try again, " + userName + " !");
                break;
            }
        }
    }
}
