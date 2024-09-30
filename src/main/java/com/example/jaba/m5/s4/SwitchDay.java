/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s4;

import com.example.jaba.m5.s3.ModernConstants;
import com.example.jaba.m5.s3.WeekDay;

/**
 * Control flow - Decision: switch and enumerator
 */
public class SwitchDay {
    /**
     * Pick a week day randomly, then print the associated food of the day
     * 
     * @param args not used
     * @see WeekDay enumerator for the week days
     * @see ModernConstants same result, but using if-else instead
     */
    public static void main(String[] args) {
        WeekDay today = SwitchDay.aDay();
        System.out.println("Today is " + today);
        System.out.print("Let's go and eat ... ");

        switch (today) {
        case MONDAY:
            System.out.println("Chinese");
            break;
        case TUESDAY:
            System.out.println("Hamburger");
            break;
        case WEDNESDAY:
            System.out.println("Pasta");
            break;
        case THURSDAY:
            System.out.println("Fish and Chips");
            break;
        case FRIDAY:
            System.out.println("Pizza");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Something else");
            break;
        }
    }

    /**
     * A randomly chosen week day
     * 
     * @return a WeekDay
     * @see WeekDay enumerator for week days
     */
    private static WeekDay aDay() {
        WeekDay[] days = WeekDay.values();
        return days[(int) (Math.random() * days.length)];
    }
}
