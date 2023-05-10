package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    static final int PLUS = 1;
    static final int MINUS = 2;
    static final int MULTIPLY = 3;

    static final int R_MIN = 1;
    static final int R_MAX = 3;

    private static String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];

    private static final String RULES = "What is the result of the expression?";

    public static void runCalcGame() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] roundData = generateRoundData(i);
            questionsAnswers[i][Engine.QUESTION] = roundData[0];
            questionsAnswers[i][Engine.ANSWER] = roundData[1];
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        int firstNumber = Utils.getMaxRandomNumber();
        int secondNumber = Utils.getMaxRandomNumber();
        String operation = getRandomOperation();
        String question = firstNumber + " " + operation + " " + secondNumber;
        String answer = String.valueOf(getCorrectAnswer(operation, firstNumber, secondNumber));
        String[] Data = {question, answer};
        return Data;
    }

    public static String getRandomOperation() {
        int chooseOperation = Utils.getRandomNumber(R_MIN, R_MAX);
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


}
