package com.pluralsight;

import java.util.Scanner;

public class TheApp {

    public static void main(String[] args) {

        //create a scanner so we can take input from the user
        Scanner theScanner = new Scanner(System.in);

        //-- below we will deal with user interaction --

        //ask the user for the first number
        System.out.print("Enter the first number: ");

        //capture the answer
        double number1 = theScanner.nextDouble();

        //ask the user for the first number
        System.out.print("Enter the second number: ");

        //capture the answer
        double number2 = theScanner.nextDouble();

        //eat the new line so we can ask text questions again, instead of numbers
        theScanner.nextLine();

        //one println for the entire menu using the """
        System.out.print(
                """
                Possible calculations:
                   (A)dd
                   (S)ubtract
                   (M)ultiply
                   (D)ivide
                Please select an option: """);

        //store the answer for the calculation you may want to do
        String calculationChoice = theScanner.nextLine();

        //calculate the result (multiply everytime for now)
        double result = number1 * number2;

        //display this to the user
        System.out.println(number1 + " * " + number2 + " = " + result);


    }

}
