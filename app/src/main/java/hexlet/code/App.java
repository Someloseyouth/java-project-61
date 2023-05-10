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
    static final int EVEN_GAME = 2;
    static final int CALC_GAME = 3;
    static final int GCD_GAME = 4;
    static final int PROGRESSION_GAME = 5;
    static final int PRIME_GAME = 6;

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
            case EXIT -> System.out.println("Exit");
            case GREET -> Cli.greet();
            case EVEN_GAME -> Even.runEvenGame();
            case CALC_GAME -> Calc.runCalcGame();
            case GCD_GAME -> GCD.runGCDGame();
            case PROGRESSION_GAME -> Progression.runProgressionGame();
            case PRIME_GAME -> Prime.runPrimeGame();
            default -> System.out.println("Wrong number");
        }
    }


}
