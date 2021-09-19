package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to the Discount Calculator");
        System.out.println("++++++++++++++++++++++++++++++++++");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String discAmount = inputScanner.nextline();

        //Convert the discAmount String to a Double
        Double discPct = Double.parseDouble(discAmount);
        System.out.println("you entered: " + discPct.toString());

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String pricesInput = inputScanner.nextline();
        String[] prices = pricesInput.split(" ");

        for (int i = 0; i < prices.length; i++) {
            //Convert each entered price to a double to perform discount calculation.
            Double priceAsDbl = Double.parseDouble(prices[i]);
            //Calculate the discounted price
            Double discPrice = priceAsDbl - (priceAsDbl * (discPct / 100));
            System.out.println("Original Price: " + prices[i] + ", Discounted Price: " + discPrice.toString());
        }



    }
}

