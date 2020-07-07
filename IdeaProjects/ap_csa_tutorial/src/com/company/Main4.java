package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        Equality();
        Null();
    }

    public static void Equality() {
        // reference types use .equals() instead of ==

        // Strings
        String a = "coffee";
        String b = "coffee";
        String c = new String("coffee");
        String d = new String("coffee");

        System.out.println(a == b); // = true
        System.out.println(a == c); // = false
        System.out.println(a.equals(b)); // = true
        System.out.println(a.equals(c)); // = true

        // ArrayLists
        ArrayList<String> abc;
        abc = new ArrayList<String>();
        abc.add("hello");
        abc.add("hi");
        abc.add("hola");

        ArrayList<String> def = abc;

        ArrayList<String> ghi;
        ghi = new ArrayList<String>();
        abc.add("hello");
        abc.add("hi");
        abc.add("hola");

        System.out.println(abc == def); // = true
        System.out.println(abc == ghi); // = false
        System.out.println(abc.equals(def)); // = true
        System.out.println(abc.equals(ghi)); // = true

        // Arrays
        int[] p = {3, 1, 2, 6};
        int[] q = p;
        int[] r = {3, 1, 2, 6};

        System.out.println(p == q); // = true
        System.out.println(p == r); // = false
        System.out.println(p.equals(q)); // = true
        System.out.println(p.equals(r)); // = false

        System.out.println(Arrays.equals(p, q)); // = true
        System.out.println(Arrays.equals(p, r)); // = true
    }

    public static void Null() {
        int[] x;
        int[] y = null;
        int[] z = {2, 3, 5, 8};

//        x[1] = 9; // Compile Time Exception
        y[1] = 9; // Null Pointer Exception
        z[1] = 0; // legal

        if (z != null) {
            System.out.println("z is not null");
        }
    }
}
