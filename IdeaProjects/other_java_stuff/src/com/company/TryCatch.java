package com.company;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Example1();
        Example2();
        Example3();

    }

    public static void Example1() {
        try {
            int[] a = {4, 5, 1};
            System.out.println(a[3]);
        } catch(Exception e) {
            System.out.println("An exception occurred.");
        }
    }

    public static void Example2() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's you favourite number?: ");

        try {
            int n = scan.nextInt();
            System.out.println(n);
        } catch(Exception e) {
            System.out.println("Sorry, please enter a number: ");
            int n = scan.nextInt();
            System.out.println(n);
        }

    }

    public static void Example3() {

        try {
            int[] a = null;
            System.out.println(a[1]);
        } catch(NullPointerException e) {
            System.out.println("Your array is null.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds.");
        } catch(Exception e) {
            System.out.println("Something else went wrong.");
        }

    }

}
