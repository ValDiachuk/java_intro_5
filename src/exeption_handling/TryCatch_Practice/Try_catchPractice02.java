package exeption_handling.TryCatch_Practice;

import utilities.ScannerHelper;

import java.util.Scanner;
public class Try_catchPractice02 {
    public static void main(String[] args) {
       /*
       Write a program that gets 2 numbers from the user as int
       Then divide these numbers and print the result

       Print a message saying "End of the program"
       */

        int num1 = ScannerHelper.getAnNumber();
        int num2 = ScannerHelper.getAnNumber();
        try {
            System.out.println(num1 / num2);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}



