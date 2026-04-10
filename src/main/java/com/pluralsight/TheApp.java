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
                Please select an option:  """);

        //store the answer for the calculation you may want to do
        String calculationChoice = theScanner.nextLine();
        String operator = "";
        double result = 0;

        if(calculationChoice.equalsIgnoreCase("A") ){
            //do the stuff for A
            System.out.println("made it to A");
            operator = "+";
            result = number1 + number2;
        } else if (calculationChoice.equalsIgnoreCase("S")) {
            //do the stuff for S
            System.out.println("made it to S");
            operator = "-";
            result = number1 - number2;
        } else if (calculationChoice.equalsIgnoreCase("M")) {
            // do the stuff for M
            System.out.println("made it to M");
            operator = "*";
            result = number1 * number2;
        } else if (calculationChoice.equalsIgnoreCase("D")) {
            //do the stuff for d
            System.out.println("made it to D");
            operator = "/";
            result = number1 / number2;
        }else{
            System.out.println("you didnt give me an option i recognize");
            System.exit(1);
        }

        //display this to the user
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);


    }

}
