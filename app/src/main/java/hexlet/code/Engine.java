package hexlet.code;


import java.util.Scanner;

public class Engine {

    public static final int COUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void runGame(String rules, String[][] questionsAnswers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
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
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
