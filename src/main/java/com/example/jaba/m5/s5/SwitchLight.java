/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s5;

import com.example.jaba.m5.s4.TrafficLight;

/**
 * Control flow - Decision: switch (modern) and enumerator
 */
public class SwitchLight {
    /**
     * Generate randomly a TrafficLight, then use it to print a message
     * 
     * @param args not used
     * @see TrafficLight enumerator for available traffic lights
     * @see com.example.jaba.m5.s4.SwitchLightModern same result using classic switch
     */
    public static void main(String[] args) {
        TrafficLight light = SwitchLight.aColor();

        System.out.println("Traffic light is " + light);

        switch (light) {
        case GREEN -> System.out.println("You can go");
        case YELLOW -> {
            System.out.print("Stop, if you can. ");
            System.out.println("Go fast, if you can't stop");
        }
        case RED -> System.out.println("Stop!");
        }
    }

    /**
     * Get randomly a traffic light
     * 
     * @return GREEN (.50), YELLOW (.25), RED (.25)
     */
    private static TrafficLight aColor() {
        return Math.random() > .5 ? TrafficLight.GREEN : //
                Math.random() > .5 ? TrafficLight.YELLOW : TrafficLight.RED;

    }
}