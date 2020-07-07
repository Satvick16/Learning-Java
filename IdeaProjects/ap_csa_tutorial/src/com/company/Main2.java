package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        UserInput();
        ForLoops();
        WhileLoops();
        DoWhileLoops();
    }

    public static void UserInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in your height: ");
        double x = keyboard.nextDouble();

        System.out.println("What is your age?: ");
        int y = keyboard.nextInt();

        System.out.println("Are you female? (true/false): ");
        boolean isFemale = keyboard.nextBoolean();

        String name = keyboard.next(); // takes the first word
        String fullName = keyboard.nextLine(); // takes entire line
    }

    public static void ForLoops() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }

    public static void WhileLoops() {
        Scanner keyboard = new Scanner(System.in);
        int userGuess = 0;

        while (userGuess != 23) {
            System.out.println("Guess the number: ");
            userGuess = keyboard.nextInt();
        }
        System.out.println("You got it right!");

//        while (true) {
//            System.out.println("repeat forever");
//        }
    }

    public static void DoWhileLoops() {
        // always executes at least once
        int i = -2;

        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
