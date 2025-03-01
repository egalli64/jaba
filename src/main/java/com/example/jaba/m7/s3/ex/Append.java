/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 * 
 * Exercise on StringBuilder methods
 */
package com.example.jaba.m7.s3.ex;

import java.util.Arrays;

/**
 * Exercise to be solved using StringBuilder::append()
 */
public class Append {
    public static void main(String[] args) {
        // TODO 1: Generate a string from an array of strings
        String[] data = { "a", "b", "c" };
        System.out.println("The input is " + Arrays.toString(data));
        System.out.println("Expecting something like \"a, b, c\" as output");

        // TODO 2: Generate a string from an array of chars
        char[] values = { 'd', 'e', 'f' };
        System.out.println("The input is " + Arrays.toString(values));
        System.out.println("Expecting something like \"d, e, f\" as output");
    }
}
