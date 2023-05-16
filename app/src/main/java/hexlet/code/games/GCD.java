package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void runGCDGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i] = generateRoundData(i);
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        int firstNumber = Utils.getMaxRandomNumber();
        int secondNumber = Utils.getMaxRandomNumber();
        String question = firstNumber + " " + secondNumber;
        String answer = String.valueOf(gcdSearch(firstNumber, secondNumber));
        String[] data = {question, answer};
        return data;
    }

    public static int gcdSearch(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
