package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
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
        while (true) {
            System.out.println("Welcome to FamousQuotes!");
            System.out.println("Would you like to change your life?");
            System.out.print("Pick a number from 1-10: ");

            try {
                int userChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\n" + quotes[userChoice - 1]);
                System.out.println("\nWould you like to see another quotes");
                System.out.println("Type 1 for Yes");
                System.out.println("Type 2 for No");
                System.out.print("Choice: ");
                int userChoice2 = scanner.nextInt();
                scanner.nextLine();
                if (userChoice2 == 1) {
                    System.out.println();
                } else if (userChoice2 == 2) {
                    System.out.println("Have a great day!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Sorry please put a number from 1-10");
                scanner.nextLine();
            }
        }
    }

}
