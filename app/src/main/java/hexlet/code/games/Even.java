package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];


    public static void runEvenGame() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] roundData = generateRoundData(i);
            questionsAnswers[i][Engine.QUESTION] = roundData[0];
            questionsAnswers[i][Engine.ANSWER] = roundData[1];
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        String question = String.valueOf(Utils.getMaxRandomNumber());
        String answer = Even.isEven(Integer.parseInt(question))
                ? "yes"
                : "no";
        String[] Data = {question, answer};
        return Data;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

