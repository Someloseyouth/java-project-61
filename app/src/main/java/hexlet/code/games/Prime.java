package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;


public class Prime {

    public static boolean ifPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number <= 1) {
            return false;
        }
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int number = Even.getMaxRandomNumber();
            String correctAnswer;
            if (ifPrime(number)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
