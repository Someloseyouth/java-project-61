package hexlet.code.games;

import hexlet.code.Cli;

import java.math.BigInteger;
import java.util.Scanner;


public class Prime {
    public static void primeGame() {
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Integer number = (int) ((Math.random() * (100 - 1)) + 1);
            String correctAnswer;
            BigInteger bigInteger = BigInteger.valueOf(number);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));
            if (probablePrime == true) {
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
                    System.out.println("Congratulations, " + Cli.name + "!");
                    System.exit(0);
                }
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                System.exit(0);
            } else if (answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                System.exit(0);
            } else {
                System.out.println("Wrong answer");
                System.out.println("Let's try again, " + Cli.name + "!");
                System.exit(0);
            }
        }
    }
}
