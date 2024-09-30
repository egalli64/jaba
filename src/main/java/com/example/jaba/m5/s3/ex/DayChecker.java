/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m5.s3.ex;

import com.example.jaba.m5.s3.ModernConstants;
import com.example.jaba.m5.s3.WeekDay;

/**
 * Exercises with conditions on an enumerator
 */
public class DayChecker {
    public static void main(String[] args) {
        WeekDay day = ModernConstants.aDay();
        System.out.println("The generated day is " + day);

        // TODO 1: if the generated weekday is FRIDAY print "Have a nice weekend"

        // TODO 2: print "Weekend" if SATURDAY or SUNDAY, "Working day" otherwise

        System.out.println("Done");
    }
}
