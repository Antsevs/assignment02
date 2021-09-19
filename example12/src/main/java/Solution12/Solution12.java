/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Anthony Sevarino
 */


/* Get principal from user
 * Get interest rate from user
 * Get time in years from user
 * use formula and include rate divided by 100 for correct notation
 * print final worth
 */

package Solution12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double prin = scnr.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = scnr.nextDouble();

        System.out.println("Enter the number of years: ");
        double years = scnr.nextDouble();

        double worth = prin * (1 + (rate/100) * years);

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + worth);
    }
}
