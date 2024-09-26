/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s3;

import java.util.Arrays;

/**
 * Using the class Arrays
 */
public class ArraysExamples {
    /**
     * Examples on Arrays static methods
     * <li>toString()
     * <li>copyOf()
     * <li>sort()
     * <li>fill()
     * <li>equals()
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] base = { 6, 2, 4, 5, 3 };

        // convert an array to string
        String s = Arrays.toString(base);
        System.out.print("The base array: ");
        System.out.println(s);

        // create a copy of one w/ length increased by 2
        int[] extended = Arrays.copyOf(base, base.length + 2);
        System.out.print("The extended array: ");
        System.out.println(Arrays.toString(extended));

        // notice that sort() works in-place
        Arrays.sort(base);
        System.out.print("The base array after sorting: ");
        System.out.println(Arrays.toString(base));

        // set all the elements to the specified value
        Arrays.fill(extended, 42);
        System.out.print("The extended array after filling: ");
        System.out.println(Arrays.toString(extended));

        // compare two arrays
        System.out.print("Comparing the base array with an array created on the fly: ");
        boolean flag = Arrays.equals(base, new int[] { 2, 3, 4, 5, 6 });
        System.out.println(flag);
    }
}
