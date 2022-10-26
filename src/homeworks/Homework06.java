package homeworks;

import javax.swing.*;
import java.util.Arrays;

public class Homework06 {

    public static void main(String[] args) {

        System.out.println("\n---------TASK-1----------\n");

        int[] arr = new int[10];
        arr[2] = 23;
        arr[4] = 12;
        arr[7] = 34;
        arr[9] = 7;
        arr[6] = 15;
        arr[0] = 89;
        System.out.println(arr[3]);
        System.out.println(arr[0]);
        System.out.println(arr[9]);
        System.out.println(Arrays.toString(arr));

        System.out.println("\n---------TASK-2----------\n");

        String[] word = new String[5];
        word[1] = "abc";
        word[4] = "xyz";
        System.out.println(word[3]);
        System.out.println(word[0]);
        System.out.println(word[4]);
        System.out.println(Arrays.toString(word));

        System.out.println("\n---------TASK-3----------\n");

        int[] num = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("\n---------TASK-4----------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n---------TASK-5----------\n");

        String[] cartoons = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        boolean hasPluto = false;
        for (String cartoon : cartoons) {
            if (cartoon.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(Arrays.toString(cartoons));
        System.out.println(hasPluto);

        System.out.println("\n---------TASK-6----------\n");
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        boolean hasGF = false;
        for (String cartoonCat : cartoonCats) {
            if (cartoonCat.equals("Garfield") && cartoonCat.equals("Felix")) {
                hasGF = true;
                break;
            }
        }
        System.out.println(hasGF);

        System.out.println("\n---------TASK-7----------\n");

        double[] n = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(n));
        for (double element : n) {
            if(element % (int)element == 0) System.out.println((int)element);
            else System.out.println(element);
        }

        System.out.println("\n---------TASK-8----------\n");

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(chars));
        int countLetters = 0;
        int countLowerCase = 0;
        int countUpperCase = 0;
        int countDigits = 0;
        int countSpecialCharacters = 0;
        for (int charL : chars) {
            if (Character.isLetter(charL)) {
                countLetters++;
                if (Character.isLowerCase(charL)) countLowerCase++;
                else countUpperCase++;
            } else if (Character.isDigit(charL)) countDigits++;
            else
                countSpecialCharacters++;
        }
            System.out.println("Letters = " + countLetters);
            System.out.println("Lowercase letters = " + countLowerCase);
            System.out.println("Uppercase letters = " + countUpperCase);
            System.out.println("Digits = " + countDigits);
            System.out.println("Special characters = " + countSpecialCharacters);

            System.out.println("\n---------TASK-9----------\n");

            String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
            System.out.println(Arrays.toString(objects));
            int upperCase = 0;
            int lowerCase = 0;
            int startsWithBP = 0;
            int bookAndPenElements = 0;

            for (String s : objects){
                if (Character.isUpperCase(s.charAt(0))) upperCase++;
                else lowerCase++;

                if (s.toLowerCase().charAt(0) == 'b' || s.toLowerCase().charAt(0) == 'p')
                    startsWithBP++;
                if (s.toLowerCase().contains("book") || s.toLowerCase().contains("pen"))
                    bookAndPenElements++;
            }

            System.out.println("Elements starts with uppercase = " + upperCase);
            System.out.println("Elements starts with lowercase = " + lowerCase);
            System.out.println("Elements starting with B or P = " + startsWithBP);
            System.out.println("Elements having ”book” or “pen“ = " + bookAndPenElements);

            System.out.println("\n---------TASK-10----------\n");

            int countMoreThan10 = 0;
            int countLessThan10 = 0;
            int countIs10 = 0;

            int[] elements = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
            System.out.println(Arrays.toString(elements));

            for (int element : elements) {
                if (element > 10) countMoreThan10++;
                else if (element < 10) countLessThan10++;
                else countIs10++;
            }
            System.out.println("Elements that are more than 10 = " + countMoreThan10);
            System.out.println("Elements that are less than 10 = " + countLessThan10);
            System.out.println("Elements that are 10 = " + countIs10);

            System.out.println("\n---------TASK-11----------\n");

            int[] first = {5, 8, 13, 1, 2};
            int[] second = {9, 3, 67, 1, 0};
            int[] third = new int [5];

        for (int i = 0; i < third.length; i++) {
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println("1st array is =" + Arrays.toString(first));
        System.out.println("1st array is = " + Arrays.toString(second));
        System.out.println("1st array is = " + Arrays.toString(third));

        }
    }








