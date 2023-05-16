package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
