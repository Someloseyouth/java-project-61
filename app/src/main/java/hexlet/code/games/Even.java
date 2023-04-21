package hexlet.code;

import java.util.Scanner;


public class Even {

    public static int getRandomNumber() {
        return (int) (1 + Math.random() * 99);
    }

    public static void evenGame() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scan.next();
        System.out.println("Hello " + name + "!");
        for (int i = 0; i < 3; i++) {
            int number = getRandomNumber();
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            else{
                System.out.println("Wrong answer");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

    }
}
