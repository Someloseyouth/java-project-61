package hexlet.code.games;

import hexlet.code.Engine;


public class Even {

    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'";

    public static void evenGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i][Engine.QUESTION] = String.valueOf(Engine.getMaxRandomNumber());

            questionsAnswers[i][Engine.ANSWER] =
                    (Even.isEven(Integer.parseInt(questionsAnswers[i][Engine.QUESTION])))
                            ? "yes"
                            : "no";
        }

        Engine.runGame(RULES, questionsAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

