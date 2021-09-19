/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Anthony Sevarino
 */


/* Get principal from user
 * Get interest rate from user
 * Get time in years from user
 * use formula and include rate divided by 100 for correct notation
 * print final worth
 */

package Solution13;

import java.lang.Math;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double prin = scnr.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = scnr.nextDouble();

        System.out.println("Enter the number of years: ");
        double years = scnr.nextDouble();

        System.out.println("Enter the number of times the interest is compounded per year: ");
        double compound = scnr.nextDouble();

        double realRate = rate/100;
        double base = (1 + realRate/compound);
        double pwr = compound * years;

        double worth = prin * Math.pow(base, pwr);
        double realWorth = (Math.round(worth*100));

        System.out.println("$" + prin + " invested at " + rate + "% for " + years + " years compounded " + compound
                + " times per year is $" + realWorth/100);
    }
}
