package com.company;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] sample_list1 = {6, 88, 89, 56, 2, 21, 23, 5, 22, 98, 4};
        int[] sample_list2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 8, 9, 7, 9};

        System.out.println(Arrays.toString(ForLoop(sample_list1)));
        System.out.println(Arrays.toString(CurNum(sample_list2)));

    }

    public static int[] ForLoop(int[] a) {

        // iterate over each element
        for (int i = 0; i < a.length; i++) {
            // compare it with every element before it
            for (int j = i-1; j > -1; j--) {
                // if i is less than j, swap them
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                } else {
                    break;
                }
            }
        }
        return a;

    }

    public static int[] CurNum(int[] a) {

        // iterate over each element
        for (int i = 0; i < a.length; i++) {
            // save it to a variable
            int curNum = a[i];
            // compare it with every element before it
            for (int j = i-1; j > 0; --j) {
                // turn a[j+1] into the higher
                // value between curNum and j
                a[j + 1] = Math.max(a[j], curNum);
                    break;
            }
        }
        return a;

    }

}
