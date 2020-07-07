package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Advanced {

    public static void lists() {
        // List = interface, ArrayList = implementation
        List<Integer> grades = new ArrayList<Integer>();
        List<Integer> grades2 = new LinkedList<Integer>();

        grades.add(5);
        grades.add(10);

        // replace element
        grades.add(1, 7);

        // useful list methods
        System.out.println(grades.get(0));
        System.out.println(grades.indexOf(7));
        System.out.println(grades.contains(10));
        System.out.println(grades.isEmpty());
        System.out.println(grades.remove(1));

        // empty a list
        grades.clear();
    }
}
