package games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.line;
import static hexlet.code.Engine.userName;

public class Calc {
    public static void gameCalc() {
        Engine.userNameScanner();
        Random random = new Random();

        System.out.println("What is the result of the expression?");
        int a = 1;
        int b = 100;
        int[] randomNumbers = new int[6];
        randomNumbers[0] = (int) (a + Math.random() * b);
        randomNumbers[1] = (int) (a + Math.random() * b);
        randomNumbers[2] = (int) (a + Math.random() * b);
        randomNumbers[3] = (int) (a + Math.random() * b);
        randomNumbers[4] = (int) (a + Math.random() * b);
        randomNumbers[5] = (int) (a + Math.random() * b);


        String[] operators = new String[]{"+", "-", "*"};
        int i1 = random.nextInt(3);
        int i2 = random.nextInt(3);
        int i3 = random.nextInt(3);
        String ch1 = operators[i1];
        String ch2 = operators[i2];
        String ch3 = operators[i3];

        int res1 = 0;
        int res2 = 0;
        int res3 = 0;

        switch (ch1) {
            case "+" -> {
                res1 = randomNumbers[0] + randomNumbers[1];
            }

            case "-" -> {
                res1 = randomNumbers[0] - randomNumbers[1];
            }

            default -> {
                res1 = randomNumbers[0] * randomNumbers[1];
            }

        }
        switch (ch2) {
            case "+" -> {
                res2 = randomNumbers[2] + randomNumbers[3];
            }

            case "-" -> {
                res2 = randomNumbers[2] - randomNumbers[3];
            }

            default -> {
                res2 = randomNumbers[2] * randomNumbers[3];
            }

        }
        switch (ch3) {
            case "+" -> {
                res3 = randomNumbers[4] + randomNumbers[5];
            }

            case "-" -> {
                res3 = randomNumbers[4] - randomNumbers[5];
            }

            default -> {
                res3 = randomNumbers[4] * randomNumbers[5];
            }

        }
        String r1 = Integer.toString(res1);
        String r2 = Integer.toString(res2);
        String r3 = Integer.toString(res3);


        for (var s = 0; s <= randomNumbers.length; s++) {
            if (s == 0) {
                System.out.println("Question: " + randomNumbers[0] + ch1 + randomNumbers[1]);
            } else if (s == 3) {
                System.out.println("Question: " + randomNumbers[2] + ch2 + randomNumbers[3]);
            } else if (s == 6) {
                System.out.println("Question: " + randomNumbers[4] + ch3 + randomNumbers[5]);
            }
            Engine.solutionScanner();

            if (s == 6 && r3.equals(line)) {
                System.out.println("Your answer: " + line + "\nCorrect!");
                System.out.println("Congratulations, " + userName + " !");

            } else if (r1.equals(line) || r2.equals(line) || r3.equals(line)) {
                System.out.println("Your answer: " + line + "\nCorrect!");
                s = s + 2;
            } else if (!r1.equals(line) && s == 0) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + r1 + ".\n"
                        + "Let's try again, " + userName + " !");
                break;

            } else if (!r2.equals(line) && s == 3) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + r2 + ".\n"
                        + "Let's try again, " + userName + " !");
                break;

            } else if (!r3.equals(line) && s == 6) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + r3 + ".\n"
                        + "Let's try again, " + userName + " !");
                break;

            }
        }
    }
}
