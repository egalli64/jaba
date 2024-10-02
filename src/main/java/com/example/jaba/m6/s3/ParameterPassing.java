/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m6.s3;

/**
 * Using parameters
 * 
 * @see Main a class that invokes methods of this class
 */
public class ParameterPassing {
    /**
     * No effect on the caller
     * 
     * @param parameter being a primitive, it is just a local copy
     */
    public void primitive(int parameter) {
        parameter *= 2;
        System.out.println("parameter is " + parameter);
    }

    /**
     * No effect on the caller
     * 
     * @param parameter an immutable, can't be changed
     */
    public void immutableReference(String parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
//        Objects.requireNonNull(parameter, "Parameter should not be null");

        System.out.println("parameter id was " + System.identityHashCode(parameter));
        parameter += " there";
        System.out.println("Now parameter id is " + System.identityHashCode(parameter));
        System.out.println("parameter value is " + parameter);
    }

    /**
     * It has effect on the caller
     * 
     * @param parameter a reference, the referred object could be changed
     */
    public void reference(StringBuilder parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
        // Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter.append(" there");
        System.out.println("parameter value is " + parameter);
    }

    /**
     * It has effect on the caller
     * 
     * @param data an array, it is a mutable reference, its values could be changed
     */
    public void reference(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("Nothing to do here");
            return;
        }

        data[0] += 1;
        System.out.println("data[0] is " + data[0]);
    }

    /**
     * Get a primitive, modify the local copy and return it
     * 
     * @param value a primitive, local copy
     * @return the increased value
     */
    public int increase(int value) {
        value += 1;
        System.out.println("Increase value is " + value);

        return value;
    }

    /**
     * Get an immutable reference, modify the local copy and return a modified copy
     * 
     * @param parameter an immutable, can't be changed
     * @return a new string based on the passed parameter
     */
    public String append(String parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return parameter;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
//        Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter += " there";
        return parameter;
    }
}
