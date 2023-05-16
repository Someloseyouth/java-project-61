package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final String RULES = "What number is missing in the progression?";

    static final int R_MIN = 1;
    static final int R_MAX = 10;
    static final int R_MIN_GEOM_PR = 5;

    public static void runProgressionGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i] = generateRoundData(i);
        }
        Engine.runGame(RULES, questionsAnswers);
    }

    private static String[] generateRoundData(int i) {
        int geometricProgressionLength = Utils.getRandomNumber(R_MIN_GEOM_PR, R_MAX);
        int firstNumber = (Utils.getRandomNumber(R_MIN, R_MAX));
        int step = (Utils.getRandomNumber(R_MIN, R_MAX));
        int replaceSlot = Utils.getRandomNumber(R_MIN, geometricProgressionLength);
        String question = printRandomProgression(geometricProgressionLength, firstNumber, step, replaceSlot);
        String answer = answerRandomProgression(geometricProgressionLength, firstNumber, step, replaceSlot);
        String[] data = {question, answer};
        return data;
    }

    public static String answerRandomProgression(int geometricProgressionLength, int firstNumber, int step, int replaceSlot) {
        String[] randProgression;
        randProgression = generateRandomProgression(geometricProgressionLength, firstNumber, step);
        String correctAnswer = randProgression[replaceSlot];
        return correctAnswer;
    }


    public static String printRandomProgression(int geometricProgressionLength, int firstNumber, int step, int replaceSlot) {
        String[] randProgression;
        randProgression = generateRandomProgression(geometricProgressionLength, firstNumber, step);
        randProgression[replaceSlot] = "..";
        String print = (firstNumber + " ");
        for (int i = 1; i < geometricProgressionLength; i++) {
            print += (randProgression[i] + " ");
        }
        return print;
    }


    private static String[] generateRandomProgression(int geometricProgressionLength, int firstNumber, int step) {
        String[] progression = new String[geometricProgressionLength];
        for (int i = 0; i < geometricProgressionLength; i++) {
            progression[i] = String.valueOf(firstNumber + step * i);
        }
        return progression;
    }
}




