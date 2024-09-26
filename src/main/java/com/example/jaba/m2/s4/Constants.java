/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s4;

/**
 * Class and local constants
 */
public class Constants {
    /** A class constant */
    static final int A_CONSTANT = 12;

    /**
     * Play with constants
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // using the class constant
        System.out.println(A_CONSTANT);

        // a local constant
        final int aConstant = 21;
        System.out.println(aConstant);

        // primitive constants can't change!
//        A_CONSTANT = 42;
//        aConstant = 18;
    }
}
