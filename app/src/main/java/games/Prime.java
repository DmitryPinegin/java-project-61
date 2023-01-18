package games;

import hexlet.code.Engine;

import java.math.BigInteger;

import static hexlet.code.Engine.line;
import static hexlet.code.Engine.userName;

public class Prime {
    public static String primeNumber() {
        Engine.userNameScanner();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int a = 2;
        int b = 500;
        int c = (int) (a + Math.random() * b);
        int c1 = (int) (a + Math.random() * b);
        int c2 = (int) (a + Math.random() * b);

        BigInteger bigInteger = BigInteger.valueOf(c);
        BigInteger bigInteger1 = BigInteger.valueOf(c1);
        BigInteger bigInteger2 = BigInteger.valueOf(c2);
        boolean probablePrime = bigInteger.isProbablePrime(c);
        boolean probablePrime1 = bigInteger1.isProbablePrime(c1);
        boolean probablePrime2 = bigInteger2.isProbablePrime(c2);
        System.out.println("Question:" + c);

        Engine.solutionScanner();
        if (probablePrime && line.equals("yes")) {
            System.out.println("Your answer: " + line + "\nCorrect!");
        } else if (probablePrime && !line.equals("yes")) {
            System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + "yes" + ".\n"
                    + "Let's try again, " + userName + " !");
            return null;
        } else if (!probablePrime && line.equals("no")) {
            System.out.println("Your answer: " + line + "\nCorrect!");
        } else {
            System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + "no" + ".\n"
                    + "Let's try again, " + userName + " !");
            return null;
        }
        System.out.println("Question:" + c1);
        Engine.solutionScanner();
        if (probablePrime1 && line.equals("yes")) {
            System.out.println("Your answer: " + line + "\nCorrect!");
        } else if (probablePrime1 && !line.equals("yes")) {
            System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + "yes" + ".\n"
                    + "Let's try again, " + userName + " !");
            return null;
        } else if (!probablePrime1 && line.equals("no")) {
            System.out.println("Your answer: " + line + "\nCorrect!");
        } else {
            System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + "no" + ".\n"
                    + "Let's try again, " + userName + " !");
            return null;
        }
        System.out.println("Question:" + c2);
        Engine.solutionScanner();
        if (probablePrime2 && line.equals("yes")) {
            System.out.println("Your answer: " + line + "\nCorrect!");
            System.out.println("Congratulations, " + userName + " !");
        } else if (probablePrime2 && !line.equals("yes")) {
            System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + "yes" + ".\n"
                    + "Let's try again, " + userName + " !");
            return null;
        } else if (!probablePrime2 && line.equals("no")) {
            System.out.println("Your answer: " + line + "\nCorrect!");
            System.out.println("Congratulations, " + userName + " !");
        } else {
            System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + "no" + ".\n"
                    + "Let's try again, " + userName + " !");
        }
        return null;
    }
}
