package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //My variables
        double totalPrice = 0;
        //My Print Statements
        System.out.println("What size would you like the sandwich, (1) Regular or (2)Large? ");
        String theLine = myScanner.nextLine();
        int sandwichSize = Integer.parseInt(theLine);


        System.out.println("What is your age? ");
        theLine = myScanner.nextLine();
        int userAge = Integer.parseInt(theLine);


        System.out.println("Would you like to make it a loaded sandwich? ");
        String makeItLoaded = myScanner.nextLine();


        double loadCost = 0;

        //Sandwich Size
        if (sandwichSize == 1) {
            totalPrice += 5.45;
            loadCost = 1;
        } else if (sandwichSize == 2) {
            totalPrice += 8.95;
            loadCost = 1.75;
        }
        
        // Loaded extra cost
        if (makeItLoaded.equalsIgnoreCase("Yes")) {
            totalPrice += loadCost;
        }


        //Users Age
        if (userAge <= 17) {
            totalPrice *= .90;
        } else if (userAge >= 65) {
            totalPrice *= .80;
        }


        System.out.println("Your price is " + totalPrice);
    }
}
