package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scan.next();
        System.out.println("Hello " + name + "!");
        scan.close();
    }
}
