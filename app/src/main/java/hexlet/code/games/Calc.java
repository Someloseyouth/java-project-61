package hexlet.code.games;

import hexlet.code.Engine;


public class Calc {
    static final int PLUS = 1;
    static final int MINUS = 2;
    static final int MULTIPLY = 3;

    static final int R_MIN = 1;
    static final int R_MAX = 3;

    static final String RULES = "What is the result of the expression?";


    public static String getRandomOperation() {
        int chooseOperation = Engine.getRandomNumber(R_MIN, R_MAX);
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
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int firstNumber = Engine.getMaxRandomNumber();
            int secondNumber = Engine.getMaxRandomNumber();
            String operation = getRandomOperation();
            questionsAnswers[i][Engine.QUESTION] = firstNumber + " " + operation + " " + secondNumber;
            questionsAnswers[i][Engine.ANSWER] = String.valueOf(getCorrectAnswer(operation, firstNumber, secondNumber));
        }
        Engine.runGame(RULES, questionsAnswers);
    }
}
