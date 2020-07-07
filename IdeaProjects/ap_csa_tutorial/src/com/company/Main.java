package com.company;

// See: Bill Barnum - DeMorgan's Laws for Computer Science and Programming

public class Main {

    public static void main(String[] args) {
        PrimitiveTypes();
        Operators();
        CastingAndOverflow();
        SwappingVariables();
        IntAndDoubleDivision();
    }

    public static void PrimitiveTypes() {
        int a = 3;
        double b = 3.0;
        b = 3;
        a = (int)3.0;
        boolean c = true;
        c = false;
    }

    public static void Operators() {
        int x;
        x = 3;
        System.out.println(3 * 3);
        x = 3 * 3;
        x = 3 * x;
        System.out.println(11 % 3);

        x++;
        x--;
        x *= 3;

        boolean z = true;
        System.out.println(!z);
    }

    public static void CastingAndOverflow() {
        // widening: casting to a data type with more precision/space
        // narrowing: casting to a data type with more precision/space
        double a = 3.0;

        // widening
        double c = (double)5;

        // narrowing
        int e = (int)3.95;

        // int range: [-2,147,483,648, 2,147,483,647]
        int x = 10;

        // byte range: [-128, 127]
        byte y;
        y = (byte)x;

        // byte, short int, long will "overflow" and
        // wrap around to -128
        y = (byte)128;

        // double and float will not wrap around
        // they go to +inf and -inf
    }

    public static void SwappingVariables() {
        int a = 1;
        int b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void IntAndDoubleDivision() {
        System.out.println(5 / 3); // = 1

        System.out.println(5.0 / 3); // = 1.6666666666666667

        System.out.println(5 / 0.0); // = Infinity
        System.out.println(-5.0 / 0); // = -Infinity
        System.out.println(0 / 0); // = NaN
    }
}
