package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;

    public static void setName(){
        Scanner scan = new Scanner(System.in);
        name = scan.next();
    }

    public static String getName(){
        return name;
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        setName();
        System.out.println("Hello, " + getName() + "!");
    }


}
