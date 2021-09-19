package Solution11;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? (use 00.00 format)");
        double euro = scnr.nextDouble();

        System.out.println("What is the exchange rate?");
        double rate = scnr.nextDouble();

        double total = euro * rate;
        double totalRounded = Math.round(total*100.0)/100.0;
        System.out.println(euro + " euros at an exchange rate of " + rate + " is\n" + totalRounded + " U.S. dollars");
    }
}
