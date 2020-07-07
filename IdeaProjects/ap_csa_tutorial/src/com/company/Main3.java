package com.company;

public class Main3 {

    public static void main(String[] args) {
        MathClass();
        Random();
        MemoryHandling();
    }

    public static void MathClass() {
        double x = Math.abs(-3.2); // = 3.2

        double y = Math.pow(3, 2.0); // = 9.0 (double)

        double z = Math.sqrt(9); // = 3.0 (double)

        System.out.println(Math.PI);

        System.out.println(Math.cos(90));
        System.out.println(Math.sin(90));
        System.out.println(Math.tan(90));

        System.out.println(Math.log(2.718281828)); // natural log

        System.out.println(Math.round(3.2));

        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));
    }

    // Important: Math.random() goes from 0.0 to 0.99999999
    public static void Random() {
        // Random number between 0 and 10
        int randNum1 = (int)(Math.random() * 11);
        // Random number between 1 and 10
        int randNum2 = (int)(Math.random() * 10) + 1;

        String[] names = {"Dorothy", "Glenda", "Toto"};
        int randomNum = (int)(Math.random() * 3);
        String chosenName = names[randomNum];

        int coinFlip = (int)(Math.random() * 2);
        if (coinFlip == 0)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }

    public static void MemoryHandling() {
        // primitive types: stack
        // reference types: heap

        int a = 3;
        int b = a;
        b = 100;

        int[] c = {1, 2, 3, 4};
        int[] d = c;
        d[1] = 99; // affects both c and d

        d = new int[5];
    }
}
