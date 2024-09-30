/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s3;

/**
 * Choosing a constant the classic way
 */
public class ClassicConstants {
    private final static String[] WEEKDAYS = { //
            "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };

    public static void main(String[] args) {
        String today = aDay();

        System.out.println("Today is " + today);
        System.out.print("Let's go and eat ... ");

        if (today == WEEKDAYS[0]) {
            System.out.println("Chinese");
        } else if (today == WEEKDAYS[1]) {
            System.out.println("Hamburger");
        } else if (today == WEEKDAYS[2]) {
            System.out.println("Pasta");
        } else if (today == WEEKDAYS[3]) {
            System.out.println("Fish and Chips");
        } else if (today == WEEKDAYS[4]) {
            System.out.println("Pizza");
        }
        // We can explicit check the other days ...
        // else if (today == WEEKDAYS[5] || today == WEEKDAYS[6]) {
        //
        // ... or we can implicitly consider all other days
        else {
            System.out.println("Something else");
        }
    }

    /**
     * Day picker
     * 
     * @return a randomly chosen day from WEEKDAY
     */
    private static String aDay() {
        return WEEKDAYS[(int) (Math.random() * WEEKDAYS.length)];
    }
}
