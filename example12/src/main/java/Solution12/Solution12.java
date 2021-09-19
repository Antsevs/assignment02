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
