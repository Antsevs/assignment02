/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Anthony Sevarino
 */

/* Prompt user for first item cost and amount
   second item cost and amount
   third item cost and amount
   multiply each item's cost with its amount
   print this amount
   multiply this amount by 0.055 and print this value
   add the result to the previous amount and print
 */

package Solution10;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter price of Item 1:");
        int price1 = scnr.nextInt();
        System.out.println("Enter quantity of Item 1:");
        int amount1 = scnr.nextInt();
        int total1 = price1 * amount1;

        System.out.println("Enter price of Item 2:");
        int price2 = scnr.nextInt();
        System.out.println("Enter quantity of Item 2:");
        int amount2 = scnr.nextInt();
        int total2 = price2 * amount2;

        System.out.println("Enter price of Item 3:");
        int price3 = scnr.nextInt();
        System.out.println("Enter quantity of Item 3:");
        int amount3 = scnr.nextInt();
        int total3 = price3 * amount3;

        double subtotal = total1 + total2 + total3;
        double tax = subtotal * 0.055;
        double aftertax = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + aftertax);
    }
}
