package hexlet.code.games;


import hexlet.code.Engine;


public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean ifPrime(int number) {
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

    public static void primeGame() {
        String[][] questionsAnswers = new String[Engine.COUNT_OF_ROUNDS][2];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            questionsAnswers[i][Engine.QUESTION] = String.valueOf(Engine.getMaxRandomNumber());

            questionsAnswers[i][Engine.ANSWER] =
                    (Prime.ifPrime(Integer.parseInt(questionsAnswers[i][Engine.QUESTION])))
                            ? "yes"
                            : "no";
        }
        Engine.runGame(RULES, questionsAnswers);
    }
}
