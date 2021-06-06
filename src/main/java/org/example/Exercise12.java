/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 12 - Computing simple interest

package org.example;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        //Read in input from user about interest/years
        Scanner getNumbers = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        Integer principal = getNumbers.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate_interest = getNumbers.nextDouble();
        System.out.print("Enter the number of years: ");
        Integer number_years = getNumbers.nextInt();

        //Calculations
        double rate_final = rate_interest / 100;
        double total_worth = principal*(1 + (rate_final * number_years));

        // Print out statement
        System.out.println(String.format("After %d years at %.02f%%, the investment will be worth $%.02f", number_years, rate_interest, total_worth));

    }
}
