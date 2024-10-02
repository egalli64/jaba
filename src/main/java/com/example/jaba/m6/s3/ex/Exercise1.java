/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m6.s3.ex;

/**
 * Fix the bug
 */
public class Exercise1 {
    public static void main(String[] args) {
        int x = 42;
        System.out.println("The original value is " + x);

        Exercise1.twoTimes(x);

        // TODO: BUG! x is expected to be doubled by the call to twoTimes()
        System.out.println(x);
    }

    /**
     * It should be called to change the help the caller to change the value of an
     * its own primitive local variable
     * <p>
     * TODO: Fix the bug
     * 
     * @param value
     */
    static void twoTimes(int value) {
        value *= 2;
    }
}
