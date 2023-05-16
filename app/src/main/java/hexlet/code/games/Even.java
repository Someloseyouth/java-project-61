package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i] = generateRoundData(i);
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        String question = String.valueOf(Utils.getMaxRandomNumber());
        String answer = Even.isEven(Integer.parseInt(question))
                ? "yes"
                : "no";
        String[] data = {question, answer};
        return data;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

