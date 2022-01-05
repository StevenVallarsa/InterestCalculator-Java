/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.interestcalculator;

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
        // get 
        
    }
    
    
    private static double getInput(String prompt) {
        
        Scanner scanner = new Scanner(System.in);
        
        double number = 0;
        
        while (true) {
            System.out.println(prompt);
            
            String input = scanner.nextLine();
            
            try {
                number = Double.parseDouble(input);
                if (number < 1 || number > 25) {
                    throw new Exception();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("That wasn't a number. Try again.\n");
            } catch (Exception e) {
                System.out.println("That number wasn't valid. Try again. \n");
            }
        }
    }
}
