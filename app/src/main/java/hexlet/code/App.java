package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greet;
import static hexlet.code.games.Calc.calcGame;
import static hexlet.code.games.Even.evenGame;
import static hexlet.code.games.GCD.GCD_Game;
import static hexlet.code.games.Prime.primeGame;
import static hexlet.code.games.Progression.progressionGame;

public class App {
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
            case 0:
                break;
            case 1:
                greet();
                break;
            case 2:
                evenGame();
                break;
            case 3:
                calcGame();
            case 4:
                GCD_Game();
            case 5:
                progressionGame();
            case 6:
                primeGame();
        }
    }


}
