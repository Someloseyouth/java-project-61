package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {
    static final int EXIT = 0;
    static final int GREET = 1;
    static final int GAME1 = 2;
    static final int GAME2 = 3;
    static final int GAME3 = 4;
    static final int GAME4 = 5;
    static final int GAME5 = 6;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        System.out.println();
        switch (choice) {
            case EXIT -> {
                System.out.println("Exit");
                System.exit(0);
            }
            case GREET -> Cli.greet();
            case GAME1 -> Even.evenGame();
            case GAME2 -> Calc.calcGame();
            case GAME3 -> GCD.gcdGame();
            case GAME4 -> Progression.progressionGame();
            case GAME5 -> Prime.primeGame();
            default -> System.out.println("Wrong number");
        }
    }


}
