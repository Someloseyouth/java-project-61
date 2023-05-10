package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];

    static final int R_MIN = 1;
    static final int R_MAX = 10;
    static final int R_MIN_GEOM_PR = 5;

    public static void runProgressionGame() {
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] roundData = generateRoundData(i);
            questionsAnswers[i][Engine.QUESTION] = roundData[0];
            questionsAnswers[i][Engine.ANSWER] = roundData[1];
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        String[] randomProgress = randomProgression();
        String question = randomProgress[0];
        String answer = randomProgress[1];
        String[] Data = {question, answer};
        return Data;
    }

    public static String[] randomProgression() {
        int geometricProgressionLength = Utils.getRandomNumber(R_MIN_GEOM_PR, R_MAX);
        int firstNumber = (Utils.getRandomNumber(R_MIN, R_MAX));
        int step = (Utils.getRandomNumber(R_MIN, R_MAX));
        int replaceSlot = Utils.getRandomNumber(R_MIN, geometricProgressionLength);
        StringBuilder progression = new StringBuilder("");
        int temp;
        int correctAnswer = 0;
        for (int i = 0; i < geometricProgressionLength; i++) {
            temp = firstNumber + step * i;
            if (i == replaceSlot) {
                progression.append(".." + " ");
                correctAnswer = temp;
            } else {
                progression.append(temp + " ");
            }
        }
        String[] randProgression = {String.valueOf(progression), String.valueOf(correctAnswer)};
        return randProgression;
    }


}
