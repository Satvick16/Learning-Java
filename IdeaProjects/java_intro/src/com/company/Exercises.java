package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        fizzBuzz();
        fibonacci();

        int[] array = {1,99,4,3,7,6,9,12,45,2,2,3,23,99,1};
        boolean x = binarySearch(array, 45);
        System.out.println(x);
    }

    public static void fizzBuzz() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number: ");
        int x = userInput.nextInt();

        String reply = "";

        if (x % 3 == 0)
            reply += "Fizz";
        if (x % 5 == 0)
            reply += "Buzz";
        if (x % 3 != 0 && x % 5 != 0)
            reply += x;

        System.out.println(reply);
    }

    public static void pauseOutput(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        Scanner again = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter number of Fibonacci elements (>1): ");
            int userInput = scanner.nextInt();
            int a = 1;
            int b = 1;
            pauseOutput(500);
            System.out.println(a);
            pauseOutput(500);
            System.out.println(b);
            pauseOutput(500);
            for (int i = 1; i <= userInput - 2; i++) {
                int[] numbers = {a, b};
                a = numbers[1];
                b = numbers[0] + numbers[1];
                System.out.println(b);
                pauseOutput(500);
            }
            System.out.println("\nThe program is finished. Again? (Y) or (N): ");
            String permission = again.nextLine().toLowerCase();
            if (permission.equals("n")) {
                System.exit(0);
            }
        }
    }
}
