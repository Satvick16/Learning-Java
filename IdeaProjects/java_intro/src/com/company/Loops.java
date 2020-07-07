package com.company;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        forLoops();
        whileLoops();
        doWhileLoops();
        breakAndContinue();
        forEachLoops();
    }

    public static void forLoops() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World " + i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("Hello World " + i);
        }
    }

    public static void whileLoops() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }

    public static void doWhileLoops() {
        // always executed at least once (rare)
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }

    public static void breakAndContinue() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();

            // goes back to beginning of a loop
            if (input.equals("pass")) {
                continue;
            }

            // exits loop
            if (input.equals("quit")) {
                break;
            }

            System.out.println(input);
        }
    }

    public static void forEachLoops() {
        // iterate over arrays

        String[] fruits = {"Apple", "Mango", "orange"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
