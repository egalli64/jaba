/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m6.s2;

/**
 * Defining methods
 * 
 * @see SimpleCaller a class that invokes methods of this class
 */
public class Simple {
    /**
     * A static method with no side effect
     * 
     * @return a string
     */
    static String aStaticMethod() {
        return "Hi";
    }

    /**
     * An instance method that multiplies two numbers (no side effect)
     * 
     * @param a a number
     * @param b another number
     * @return the product of the two input values
     */
    int anInstanceMethod(int a, int b) {
        return a * b;
    }

    /**
     * A void instance method with a side effect (printing to console)
     * 
     * @param flag if true, print "Hello"; otherwise, print "Goodbye"
     */
    void anotherInstanceMethod(boolean flag) {
        if (flag) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
    }

    /**
     * An instance method that returns a message (no side effect)
     * 
     * @param flag a boolean
     * @return "Hello" if flag is true, otherwise "Goodbye"
     */
    String greet(boolean flag) {
        if (flag == true) {
            return "Hello";
        } else {
            return "Goodbye";
        }
    }
}
