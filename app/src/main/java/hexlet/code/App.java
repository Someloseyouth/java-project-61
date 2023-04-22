package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;



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
                System.exit(0);
                break;
            case 1:
                Cli.greet();
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calcGame();
                break;
            case 4:
                GCD.GCD_Game();
                break;
            case 5:
                Progression.progressionGame();
                break;
            case 6:
                Prime.primeGame();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }


}
