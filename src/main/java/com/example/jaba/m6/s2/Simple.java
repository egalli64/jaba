/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m6.s2;

/**
 * Defining methods
 * 
 * @see Main a class that invokes methods of this class
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
     * An instance method with no side effect
     * 
     * @param a a value
     * @param b another value
     * @return the product of the two input values
     */
    int anInstanceMethod(int a, int b) {
        return a * b;
    }

    /**
     * A void instance method with a side effect (print to console)
     * 
     * @param flag a value
     */
    void anotherInstanceMethod(boolean flag) {
        if (flag) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
    }

    /**
     * An instance method with no side effect
     * 
     * @param flag a boolean
     * @return a string based on the input flag
     */
    String greet(boolean flag) {
        if (flag == true) {
            return "Hello";
        } else {
            return "Goodbye";
        }
    }
}
