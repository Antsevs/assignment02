/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Anthony Sevarino
 */

/* Ask user for order amount
 * ask user for their state
 * print their initial total
 * print their tax which is 0 unless their state is WI
 * if state is WI then tax is 0.55
 * print final total
 */

package Solution14;

import java.util.Scanner;
import java.util.*;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the order amount?");
        int ordramt = scnr.nextInt();

        System.out.println("What is the state?");
        String state = scnr.next();

        System.out.println("The subtotal is: $" + ordramt);

        double tax = 0;
        if(state.equals("WI")){
            tax = 0.55;
        }

        System.out.println("The tax is: $" + tax);

        double finalTotal = ordramt + tax;

        System.out.println("The total is: $" + finalTotal);
    }
}
