/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m6.s2;

/**
 * Invoking methods
 * 
 * @see Simple the referenced class
 */
public class SimpleCaller {
    /**
     * Calls methods from the standard library and a custom class
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // call "sqrt()", static method in class "Math"
        double root = Math.sqrt(121.0);

        // call "println()", instance method
        // defined in an instance of class PrintStream referenced by "out"
        System.out.println(root);

        // call "aStaticMethod()" in custom class "Simple"
        String aString = Simple.aStaticMethod();
        System.out.println(aString);

        // create an object of type "Simple" to call instance methods
        Simple reference = new Simple();

        // call "anInstanceMethod()", and store its return value
        int result = reference.anInstanceMethod(7, 6);
        System.out.println(result);

        // call "anotherInstanceMethod()" with a boolean argument
        reference.anotherInstanceMethod(false);

        // call the instance method "greet()" and store its return value
        String output = reference.greet(true);
        System.out.println(output);
    }
}
