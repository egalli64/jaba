/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s2;

/**
 * Defining and using an array with the shortcut initialization
 */
public class ArrayShortcut {
    public static void main(String[] args) {
        // Array with length 3, each element is initialized as described
        int[] data = { 1, 4, 13 };

        System.out.print("First element is ");
        System.out.println(data[0]);

        System.out.print("Last element is ");
        System.out.println(data[data.length - 1]);

        // !!! be careful with indices !!!
//        data[data.length] = 21; // WRONG! exception!
        data[data.length - 1] = 21;

        System.out.print("Now the last element is ");
        System.out.println(data[data.length - 1]);

        System.out.print("The index of the last element is ");
        System.out.println(data.length - 1);

        System.out.print("The array length is ");
        System.out.println(data.length);
    }
}
