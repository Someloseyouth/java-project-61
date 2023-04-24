package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;


public class Even {

    static final int R_MIN = 1;
    static final int R_MAX = 99;


    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getMaxRandomNumber() {
        return (int) ((Math.random() * (R_MAX - R_MIN)) + R_MIN);
    }

    public static void evenGame() {
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int number = getMaxRandomNumber();
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + Cli.getName() + "!");
                    System.exit(0);
                }
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            } else if (answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            } else {
                System.out.println("Wrong answer");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            }
        }

    }
}
