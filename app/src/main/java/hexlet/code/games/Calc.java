package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

import static hexlet.code.Cli.greet;
import static hexlet.code.games.Even.getRandomNumber;

public class Calc {
    public static String getRandomOperation() {
        int chooseOperation = getRandomNumber(1, 3);
        return switch (chooseOperation) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            default -> null;
        };
    }

    public static void calcGame() {
        greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int firstNumber = getRandomNumber(1, 99);
            int secondNumber = getRandomNumber(1, 99);
            int correctAnswer = 0;
            String operation = getRandomOperation();
            String example = firstNumber + " " + operation + " " + secondNumber;
            switch (operation) {
                case "+" -> correctAnswer = firstNumber + secondNumber;
                case "-" -> correctAnswer = firstNumber - secondNumber;
                case "*" -> correctAnswer = firstNumber * secondNumber;
            }
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + example);
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
