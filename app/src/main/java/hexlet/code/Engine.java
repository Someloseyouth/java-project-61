package hexlet.code;


import java.util.Scanner;

public class Engine {

    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    static final int R_MIN = 1;
    static final int R_MAX = 99;

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getMaxRandomNumber() {
        return (int) ((Math.random() * (R_MAX - R_MIN)) + R_MIN);
    }

    public static void runGame(String rules, String[][] questionsAnswers) {
        Scanner scan = new Scanner(System.in);
        Cli.greet();
        System.out.println(rules);
        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionsAnswers[i][QUESTION]);
            String userAnswer = scan.next();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equalsIgnoreCase(questionsAnswers[i][ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + questionsAnswers[i][ANSWER] + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
