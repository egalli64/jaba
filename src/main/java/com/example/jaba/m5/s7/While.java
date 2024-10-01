/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s7;

/**
 * Control flow - Loop: while
 */
public class While {
    /**
     * Using while to loop on the args array. If args is empty, the while block is
     * (correctly) never executed.
     * 
     * @param args each of its items are printed
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me arguments!");
        }

        // loop variable - in a while loop is defined _before_ the loop itself
        int i = 0;
        while (i < args.length) {
            System.out.println("The argument " + i + " is " + args[i]);
            // remember to change the loop variable!
            i++;
        }

        // the while loop variable is visible also after the loop
        System.out.println("done, looped " + i + " times");
    }
}
