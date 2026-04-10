package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What size would you like the sandwich, (1) Regular or (2)Large? ");
        int sandwichSize = myScanner.nextInt();

        System.out.println("What is your age? ");
        int userAge = myScanner.nextInt();


        double basePrice = 0;
        if (sandwichSize == 1){
            basePrice += 5.45;
        }
        else if(sandwichSize == 2) {
            basePrice += 8.95;
        }
        if(userAge <= 17){
            basePrice *= .90;
        }
        else if (userAge >= 65) {
            basePrice *= .80;
        }



        System.out.println("Your price is " + basePrice);
    }
}
