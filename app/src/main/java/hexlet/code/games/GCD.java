package hexlet.code.games;

import hexlet.code.Cli;


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

    public static void gcdGame() {
        int rMin = 1;
        int rMax = 99;
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int firstNumber = Even.getRandomNumber(rMin, rMax);
            int secondNumber = Even.getRandomNumber(rMin, rMax);
            int correctAnswer = gcdSearch(firstNumber, secondNumber);
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + Cli.getName() + "!");
                    System.exit(0);
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'" + ".");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            }
        }
    }
}
