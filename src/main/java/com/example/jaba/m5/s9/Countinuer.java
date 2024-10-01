/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s9;

/**
 * Control flow - Loop: continue
 */
public class Countinuer {
    /**
     * Pass to the next iteration in a loop
     * 
     * @param args all the arguments are printed, but the third one
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass a few args");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.print("The argument " + i);

                if (i == 2) {
                    System.out.println(" is skipped");
                    continue;
                }

                System.out.println(" is " + args[i]);
            }

            System.out.println("done!");
        }
    }
}
