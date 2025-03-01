/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercise on String methods
 */
package com.example.jaba.m7.s2.ex;

import java.util.Arrays;

/**
 * Exercise to be solved using String::length()
 */
public class ALength {
    /**
     * Loop on an array of strings, apply the length() method on each element
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[] data = { "some", "strings", "in", "here" };
        System.out.println("The strings are " + Arrays.toString(data));

        // TODO: print each string and its length on a different line
        // For each element we should get something like: "some" has length 4
    }
}
