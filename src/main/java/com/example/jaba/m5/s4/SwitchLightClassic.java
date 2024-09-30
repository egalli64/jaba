/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s4;

/**
 * Control flow - Decision: switch and constants (no enumerator)
 */
public class SwitchLightClassic {
    /**
     * Use the passed argument as the current traffic light
     * 
     * @param args its first element should be the current traffic light
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Exactly one argument expected!");
            return;
        }

        System.out.println("The light is " + args[0]);

        switch (args[0]) {
        case "GREEN":
            System.out.println("You can go");
            break;
        case "YELLOW":
            System.out.println("Stop, if you can");
            break;
        case "RED":
            System.out.println("Stop!");
            break;
        default:
            System.out.println("Wrong!");
        }
    }
}
