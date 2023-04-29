package hexlet.code.games;

import hexlet.code.Engine;


public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

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
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int firstNumber = Engine.getMaxRandomNumber();
            int secondNumber = Engine.getMaxRandomNumber();
            questionsAnswers[i][Engine.QUESTION] = firstNumber + " " + secondNumber;
            questionsAnswers[i][Engine.ANSWER] = String.valueOf(gcdSearch(firstNumber, secondNumber));
        }
        Engine.runGame(RULES, questionsAnswers);
    }
}
