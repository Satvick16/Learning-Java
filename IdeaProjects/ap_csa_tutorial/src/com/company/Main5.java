package com.company;

import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
//        Strings();
//        Arrays();
//        Traversing1DArrays();
//        Traversing2DArrays();
        ReversingArrays();
    }

    public static void Strings() {
        // points to same memory location
        String a = "hello";
        String b = "hello";

        // points to separate memory locations
        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(a.equalsIgnoreCase(c)); // = true
        System.out.println(a.length());
        System.out.println(a.substring(2)); // = "llo"
        System.out.println(a.substring(1, 4)); // = "ell"
    }

    public static void Arrays() {
        int[] x = new int[4];
        int[] y = {3, 5, 7, 2};

        x[2] = 12;
        System.out.println(y[1]);

        // 3 rows, 4 columns
        // 3 arrays with 4 elements
        int[][] a = new int[3][4];
        int[][] b = {{3, 4, 5}, {5, 4, 6}};
    }

    public static void Traversing1DArrays() {
        int[] x = {2, 1, 5, 8};

        // for loop
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }

        for (int i = 0; i < x.length; i += 2) {
            System.out.println(x[i] + " ");
        }

        // for-each loop
        for (int t : x) {
            System.out.println(t + " ");
        }
    }

    // Important:
    public static void Traversing2DArrays() {
        int[][] arr = {{2, 3, 1}, {8, 5, 6}};

        // note: System.out.print() vs. System.out.println()

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Important:
    public static void ReversingArrays() {
        int[] x = {4, 2, 6 ,1 ,7};

        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - (i + 1)];
            x[x.length - (i + 1)] = temp;
        }

        System.out.println(Arrays.toString(x));
    }
}
