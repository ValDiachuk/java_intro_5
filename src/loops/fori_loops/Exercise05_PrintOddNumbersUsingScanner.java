package loops.fori_loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        /*
Write a Java program to ask user to enter a number and print
all the odd numbers starting from 0 to given number by user
(0 and given number is included)

Test data:
7

Expected output:
1
3
5
7
 */
        int number = ScannerHelper.getAnNumber();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) System.out.println(i);

        }
    }
}
