/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s3.ex;

/**
 * Exercise on associativity and precedence
 */
public class FixMe {
    /**
     * Fix the execution order to get the expected result
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        double a = 1.0;
        // TODO: use parentheses to fix the bug
        double result = 1 / a + 1 / a + 1 / a + 1 / a;
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: 0.6000000000000001");
    }
}
