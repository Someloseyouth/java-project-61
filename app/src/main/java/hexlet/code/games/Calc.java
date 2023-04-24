package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;


public class Calc {
    static final int PLUS = 1;
    static final int MINUS = 2;
    static final int MULTIPLY = 3;

    static final int R_MIN = 1;
    static final int R_MAX = 3;


    public static String getRandomOperation() {
        int chooseOperation = Even.getRandomNumber(R_MIN, R_MAX);
        return switch (chooseOperation) {
            case PLUS -> "+";
            case MINUS -> "-";
            case MULTIPLY -> "*";
            default -> "Something went wrong, sorry. Try again.";
        };
    }

    public static int getCorrectAnswer(String operation, int firstNumber, int secondNumber) {
        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
        };
    }

    public static void calcGame() {
        Cli.greet();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int firstNumber = Even.getMaxRandomNumber();
            int secondNumber = Even.getMaxRandomNumber();
            String operation = getRandomOperation();
            int correctAnswer = getCorrectAnswer(operation, firstNumber, secondNumber);
            String example = firstNumber + " " + operation + " " + secondNumber;
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + example);
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
