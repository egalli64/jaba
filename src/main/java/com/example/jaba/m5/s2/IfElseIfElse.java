/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s2;

/**
 * Control flow - Decision: if, else if, else
 */
public class IfElseIfElse {
    /**
     * One among the different blocks is executed
     * 
     * @param args length used for determining what to print
     */
    public static void main(String[] args) {
        // exactly one of these three blocks is going to be executed
        if (args.length == 0) {
            System.out.println("You didn't pass me any argument!");
        } else if (args.length == 1) {
            System.out.println("You passed me one argument");
        } else if (args.length == 2) {
            System.out.println("You passed me two arguments");
        } else {
            System.out.println("You passed me three or more arguments");
        }

        // always executed
        System.out.println("Bye");
    }
}
