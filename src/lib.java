//Jackie fang 9/24/2018

import java.util.Scanner;

public class lib {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome, " + name + ".");
    }
}
