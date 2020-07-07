package com.company;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] sample_list = {6, 88, 89, 56, 2, 21, 23, 5, 22, 98, 4};

        System.out.println(Arrays.toString(Sort(sample_list)));

    }

    public static int[] Sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;

    }

}
