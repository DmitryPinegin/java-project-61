package games;
import hexlet.code.Engine;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Random;
import static hexlet.code.Engine.line;
import static hexlet.code.Engine.userName;
public class Progression {
    public static String arithmeticProgression() {
        Random random = new Random();
        int c = 1 + random.nextInt(11);
        int c1 = 1 + random.nextInt(11);
        int c2 = 1 + random.nextInt(11);
        int d = 1 + random.nextInt(11);
        int d1 = 1 + random.nextInt(11);
        int d2 = 1 + random.nextInt(11);
        int e = 5 + random.nextInt(6);
        int e1 = 5 + random.nextInt(6);
        int e2 = 5 + random.nextInt(6);
        int b = random.nextInt(e);
        int b1 = random.nextInt(e1);
        int b2 = random.nextInt(e2);
        int[] v = new int[e];
        int[] v1 = new int[e1];
        int[] v2 = new int[e2];
        for (int i = 0; i < v.length; i++) {
            v[i] = c + (d * i);
        }
        for (int i1 = 0; i1 < v1.length; i1++) {
            v1[i1] = c1 + (d1 * i1);
        }
        for (int i2 = 0; i2 < v2.length; i2++) {
            v2[i2] = c2 + (d2 * i2);
        }
        Engine.userNameScanner();
        System.out.println("What number is missing in the progression?");
        System.out.print("Question:");
        int f = 0;
        for (int a = 0; a < v.length; a++) {
            if (a == b) {
                f = v[a];
                String str = "..";
                System.out.print(" " + str + " ");
            } else {
                System.out.print(" " + v[a] + " ");
            }
        }
        System.out.println();
        Engine.solutionScanner();
        int u = NumberUtils.toInt(line);
        for (int a = 0; a < v.length; a++) {
            if (u == 0) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + f + ".\nLet's try again, " + userName + " !");
                return null;
            } else if (f == u) {
                System.out.println("Your answer: " + u + "\nCorrect!");
                break;
            } else if (f != u) {
                System.out.println("'" + u + "'" + " is wrong answer ;(. Correct answer was " + f + ".\nLet's try again, " + userName + " !");
                return null;
            }
        }
        System.out.print("Question:");
        int f1 = 0;
        for (int a = 0; a < v1.length; a++) {
            if (a == b1) {
                f1 = v1[a];
                String str = "..";
                System.out.print(" " + str + " ");
            } else {
                System.out.print(" " + v1[a] + " ");
            }
        }
        System.out.println();
        Engine.solutionScanner();
        int u1 = NumberUtils.toInt(line);
        for (int a = 0; a < v1.length; a++) {
            if (u1 == 0) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + f1 + ".\nLet's try again, " + userName + " !");
                return null;
            } else if (f1 == u1) {
                System.out.println("Your answer: " + u1 + "\nCorrect!");
                break;
            } else if (f1 != u1) {
                System.out.println("'" + u1 + "'" + " is wrong answer ;(. Correct answer was " + f1 + ".\nLet's try again, " + userName + " !");
                return null;
            }
        }
        System.out.print("Question:");
        int f2 = 0;
        for (int a = 0; a < v2.length; a++) {
            if (a == b2) {
                f2 = v2[a];
                String str = "..";
                System.out.print(" " + str + " ");
            } else {
                System.out.print(" " + v2[a] + " ");
            }
        }
        System.out.println();
        Engine.solutionScanner();
        int u2 = NumberUtils.toInt(line);
        for (int a = 0; a < v2.length; a++) {
            if (u2 == 0) {
                System.out.println("'" + line + "'" + " is wrong answer ;(. Correct answer was " + f2 + ".\nLet's try again, " + userName + " !");
                return null;
            } else if (f2 == u2) {
                System.out.println("Your answer: " + u2 + "\nCorrect!");
                System.out.println("Congratulations, " + userName + " !");
                break;
            } else if (f2 != u2) {
                System.out.println("'" + u2 + "'" + " is wrong answer ;(. Correct answer was " + f2 + ".\nLet's try again, " + userName + " !");
                return null;
            }
        } return null;
    }
}



