package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        // See quotes free quotes
        String[] quotes = new String[10];

        quotes[0] = "If you can change you mind, you can change your life.";
        quotes[1] = "You define your own life. Don't let other people write your script.";
        quotes[2] = "Be kind whenever possible. It is always possible.";
        quotes[3] = "You can have it all. You just can't have it all at once.";
        quotes[4] = "Don't feel quilty for doing what's best for you.";
        quotes[5] = "Some people want it to happen, some wish it would happen, others make it happen";
        quotes[6] = "A winer is a dreamer who never gives up.";
        quotes[7] = "Never bend your head. Always hold it high. Look the world straight in the eye.";
        quotes[8] = "Have no fear of perfection, you'll never reach it.";
        quotes[9] = "Live as if you were to die tomorrow. Learn as if you were to live forever.";

        Scanner scanner = new Scanner(System.in);
        // Repeats prompting to show user more quotes.
        while (true) {
            System.out.println("Welcome to FamousQuotes!");
            System.out.println("Would you like to change your life?");
            System.out.println("1: Choose your Quote.");
            System.out.println("2: Randomize your life");
            System.out.print("Choice: ");
            int fateChoice = scanner.nextInt();
            int quoteIndex = 0;
            // Helps catch any index out of bounds errors.
            try {

                if (fateChoice == 1) {
                    System.out.print("\nPick a number from 1-10: ");
                    quoteIndex = scanner.nextInt();
                    scanner.nextLine();
                } else if (fateChoice == 2) {
                    quoteIndex = (int) (Math.random() * 11) + 0;
                }

                System.out.println("\n" + quotes[quoteIndex - 1]);
                System.out.println("\nWould you like to see another quotes");
                System.out.println("Type 1 for Yes");
                System.out.println("Type 2 for No");
                System.out.print("Choice: ");
                int repeat = scanner.nextInt();
                scanner.nextLine();
                if (repeat == 1) {
                    System.out.println();
                } else if (repeat == 2) {
                    System.out.println("Have a great day!");
                    break;
                }
            }
            // Catchs the error and tells the user why their getting the error.
            catch (Exception e) {
                System.out.println("Sorry please put a number from 1-10");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}
