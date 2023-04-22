package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Arrays;
import java.util.Scanner;




public class Progression {

    private static String point;

    public static String randomProgression() {
        int[] geometricProgression = new int[Even.getRandomNumber(5, 10)];
        int firstNumber = (Even.getRandomNumber(1, 10));
        int step = (Even.getRandomNumber(1, 10));
        int replaceSlot = Even.getRandomNumber(geometricProgression.length, 1);
        geometricProgression[0] = firstNumber;
        for (int i = 1; i < geometricProgression.length; i++) {
            geometricProgression[i] = geometricProgression[i - 1] + step;
        }
        point = String.valueOf((geometricProgression[replaceSlot]));
        return Arrays.toString(geometricProgression).replace(point, "..");
    }

    public static void progressionGame() {
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("What number is missing in the progression?");
            System.out.println("Question: " + randomProgression());
            int correctAnswer = Integer.parseInt(point);
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                    System.exit(0);
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".");
                System.out.println("Let's try again, " + Cli.name + "!");
                System.exit(0);
            }
        }
    }
}
