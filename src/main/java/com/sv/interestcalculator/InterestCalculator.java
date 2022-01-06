/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.interestcalculator;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-00-00
 * purpose: A simple interest calculator
 */
public class InterestCalculator {
    
    public static void main(String[] args) {
        
        // get deposit
        double startBalance = getInput("What is your initial deposit?", 1000, 1000000, "dollars");
        double endBalance = startBalance;
        
        // get interest rate
        double interest = getInput("What is the interest rate?", 0.1, 25, "percent");
        
        // get duration
        int years = (int)(Math.round(getInput("How many years?", 1, 25, "years")));
        
        // loop through years, and calculate and print results
        System.out.println("\t\tINTEREST\tPRINCIPLE");
        for (int i = 1; i <= years; i++) {
            // add interest by year
            double yearsInterest = endBalance * interest / 100;
            endBalance += yearsInterest;
            System.out.printf("Year %02d: \t$%,.2f \t$%,.2f%n", i,yearsInterest, endBalance);
            
            // add interest by month
            // add interest by day
        }
        
        System.out.printf("%nYou made $%,.2f in %d years. Not bad!", endBalance - startBalance, years);
        
    }
    
    
    private static double getInput(String prompt, double min, double max, String units) {
        
        Scanner scanner = new Scanner(System.in);
        
        double number = 0;
        
        while (true) {
            System.out.println(prompt);
            
            String input = scanner.nextLine();
            
            try {
                number = Double.parseDouble(input);
                if (number < min || number > max) {
                    throw new Exception();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("That wasn't a number. Try again.\n");
            } catch (Exception e) {
                System.out.printf(Locale.US,"That number wasn't valid. it must be between %,.2f and %,.2f %s.\n", min, max, units);
            }
        }
    }
}
