package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;


public class Progression {

    private static int correctAnswer;
    static final int R_MIN = 1;
    static final int R_MAX = 10;
    static final int R_MIN_GEOM_PR = 5;

    public static void randomProgression() {

        int[] geometricProgression = new int[Even.getRandomNumber(R_MIN_GEOM_PR, R_MAX)];
        int firstNumber = (Even.getRandomNumber(R_MIN, R_MAX));
        int step = (Even.getRandomNumber(R_MIN, R_MAX));
        int replaceSlot = Even.getRandomNumber(R_MIN, geometricProgression.length);
        geometricProgression[0] = firstNumber;
        for (int i = 1; i < geometricProgression.length; i++) {
            geometricProgression[i] = geometricProgression[i - 1] + step;
        }
        for (int i = 0; i < geometricProgression.length; i++) {
            if (i == replaceSlot) {
                System.out.print(".." + " ");
                correctAnswer = geometricProgression[i];
            } else {
                System.out.print(geometricProgression[i] + " ");
            }
        }
    }

    public static void progressionGame() {
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("What number is missing in the progression?");
            System.out.print("Question: ");
            randomProgression();
            System.out.println();
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + Cli.getName() + "!");
                    System.exit(0);
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + correctAnswer + "'" + ".");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            }
        }
    }
}
