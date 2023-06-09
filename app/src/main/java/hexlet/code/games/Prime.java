package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrimeGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i] = generateRoundData(i);
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        String question = String.valueOf(Utils.getMaxRandomNumber());
        String answer = Prime.isPrime(Integer.parseInt(question))
                ? "yes"
                : "no";
        String[] data = {question, answer};
        return data;
    }

    public static boolean isPrime(int number) {
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
}
