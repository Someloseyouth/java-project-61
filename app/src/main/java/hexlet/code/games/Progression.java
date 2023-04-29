package hexlet.code.games;


import hexlet.code.Engine;


public class Progression {
    private final static String RULES = "What number is missing in the progression?";

    private static int correctAnswer;
    static final int R_MIN = 1;
    static final int R_MAX = 10;
    static final int R_MIN_GEOM_PR = 5;

    public static String randomProgression() {
        int geometricProgressionLength = Engine.getRandomNumber(R_MIN_GEOM_PR, R_MAX);
        int firstNumber = (Engine.getRandomNumber(R_MIN, R_MAX));
        int step = (Engine.getRandomNumber(R_MIN, R_MAX));
        int replaceSlot = Engine.getRandomNumber(R_MIN, geometricProgressionLength);
        StringBuilder progression = new StringBuilder("");
        int temp;
        for (int i = 0; i < geometricProgressionLength; i++) {
            temp = firstNumber + step * i;
            if (i == replaceSlot) {
                progression.append(".." + " ");
                correctAnswer = temp;
            } else {
                progression.append(temp + " ");
            }
        }
        return String.valueOf(progression);
    }

    public static void progressionGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i][Engine.QUESTION] = randomProgression();
            questionsAnswers[i][Engine.ANSWER] = String.valueOf(correctAnswer);
        }
        Engine.runGame(RULES, questionsAnswers);
    }
}
