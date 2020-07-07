package com.company;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        userInputs();
        logicalOperators();
        ifStatements();
        switchStatements();
    }

    public static void userInputs() {
        /** read user inputs */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + "years old.");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner2.nextLine();
        System.out.println("You are " + name);
    }

    public static void logicalOperators() {
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }

    public static void ifStatements() {
        int temp = 32;

        if (temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink plenty of water.");
        } else if (temp > 20) {
            System.out.println("Nice day.");
        } else {
            System.out.println("Cold day.");
        }

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

        // ternary operator
        // if boolean statement is satisfied, "First", otherwise (:), "Economy"
        String className = income > 100_000 ? "First" : "Economy";
    }

    public static void switchStatements() {
        // switch statements
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin.");
                break;

            case "moderator":
                System.out.println("You're a moderator.");
                break;

            default:
                System.out.println("You're a guest.");
        }
    }
}
