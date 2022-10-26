package homeworks;

import java.util.Scanner;

public class proba {

    public static void main(String[] args) {

        System.out.println("\n====================TASK - 7====================\n");
        /*
        Write a program that asks user to enter their first and last
        name
        And count how many vowel letters they have in their first and
        last name
        Vowel letters = a, e, i, o, u
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first and last name:");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");

        System.out.println("\n====================TASK - 1====================\n");

    }
}