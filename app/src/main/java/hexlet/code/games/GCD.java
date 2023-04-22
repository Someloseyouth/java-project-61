package hexlet.code.games;

import hexlet.code.Cli;

import static hexlet.code.Cli.greet;
import static hexlet.code.games.Even.getRandomNumber;

import java.util.Scanner;


public class GCD {

    public static int gcdSearch(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void GCD_Game() {
        greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int firstNumber = getRandomNumber(1, 99);
            int secondNumber = getRandomNumber(1, 99);
            int correctAnswer = gcdSearch(firstNumber, secondNumber);
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + firstNumber + " " + secondNumber);
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
