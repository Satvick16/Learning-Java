package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        primitiveTypes();
        referenceTypes();
        otherStuff();
    }

    public static void primitiveTypes() {
        /** primitive types
         * copied by value */
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        byte x = 1;
        byte y = x;
        x = 2;
        // y is not affected when x is updated
        System.out.println(y);
    }

    public static void referenceTypes() {
        /** reference types
         * copied by reference */


        /** strings
         * reference type */

        String message = "  Hello World  " + "!";
        System.out.println(message.endsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        // does not change original string
        System.out.println(message.replace("o", "0"));
        System.out.println(message.toLowerCase());
        // removes whitespace
        System.out.println(message.trim());

        /** arrays
         * reference type */
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        // the only way to display items in an array
        System.out.println(Arrays.toString(numbers));

        // multi-dimensional arrays
        int[][] numbers2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));
    }

    public static void otherStuff() {
        /** constants */
        final float PI = 3.14F;

        /** casting */
        double result = (double)10 / (double)3;
        System.out.println(result);

        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);
        // implicit casting (does not require manual type conversion - no data loss): byte > short > int > long > float > double

        /** wrapper class
         * convert strings to numbers */
        String s = "1";
        System.out.println(Integer.parseInt(s));
        String s2 = "1.1";
        System.out.println(Float.parseFloat(s2));

        /** math class */
        int num = Math.round(1.1F);
        int num2 = Math.max(1, 2);
        int num3 = Math.min(1, 2);
        double num4 = Math.random() * 100;
    }
}
