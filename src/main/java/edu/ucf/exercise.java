/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // record values
        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();

        // calculate totals
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = ((subtotal * 5.5) / 100);
        double total = subtotal + tax;

        // output
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
