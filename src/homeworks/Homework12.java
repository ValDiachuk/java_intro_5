package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("\n---------TASK-1----------\n");

        // String str = "";
        //String str = "Java";
        // String str = "123Hello";
        // String str = "123Hello World149";
        String str = "23Tech456Global149";
        System.out.println(noDigit(str));

        System.out.println("\n---------TASK-2----------\n");

        //String str2 = "";
        //String str2 = "xyz";
        //String str2 = "JAVA";
        //String str2 = "125$";
        String str2 = "TechGlobal";
        System.out.println(noVowel(str2));

        System.out.println("\n---------TASK-3----------\n");

        //String str3 = "";
        //String str3 = "Java";
        //String str3 = "John’s age is 29";
        String str3 = "$125.0";
        System.out.println(sumOfDigits(str3));

        System.out.println("\n---------TASK-4----------\n");

        //String str4 = "";
        //String str4 = "java";
        String str4 = "John’s age is 29";
        //String str4 = "$125.0";
        //System.out.println(hasUpperCase(str4));

        System.out.println("\n---------TASK-5----------\n");

        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(middleInt(a, b, c));
        a = 1;
        b = 2;
        c = 2;
        System.out.println(middleInt(a, b, c));
        a = 5;
        b = 5;
        c = 8;
        System.out.println(middleInt(a, b, c));
        a = 5;
        b = 3;
        c = 5;
        System.out.println(middleInt(a, b, c));
        a = -1;
        b = 25;
        c = 10;
        System.out.println(middleInt(a, b, c));

        System.out.println("\n---------TASK-6----------\n");

        //int [] arr = {1, 2, 3 ,4};
        //int [] arr = {13, 2, 3 };
        int[] arr = {13, 13, 13, 13, 13};
        System.out.println(Arrays.toString(no13(arr)));

        System.out.println("\n---------TASK-7----------\n");

        //int[] numbers = {1, 2, 3, 4};
        //int[] numbers = {0, 5};
        int[] numbers = {5, 0, 6};
        //int[] numbers = {};

        System.out.println(Arrays.toString(arrFactorial(numbers)));

        System.out.println("\n---------TASK-8----------\n");

        //String str8 = "";
        //String str8 = "abc123$#%";
        String str8 = "12ab$%3c%";

        System.out.println(Arrays.toString(categorizeCharacters(str8)));
    }

    //-----------------------------------------Task-1-----------------------------------------//
    public static String noDigit(String str) {

        return str.replaceAll("\\d", "");
    }

    //-----------------------------------------Task-2-----------------------------------------//
    public static String noVowel(String str2) {
        return str2.replaceAll("[aeiouAEIOU]", "");

    }

    //-----------------------------------------Task-3-----------------------------------------//
    public static int sumOfDigits(String str3) {

        int sum = 0;
        for (int i = 0; i < str3.length(); i++) {
            sum += Character.getNumericValue(str3.charAt(i));
        }

        return sum;
    }

    //-----------------------------------------Task-4-----------------------------------------//
    public static boolean hasUpperCase(String str4) {
        for (int i = 0; i < str4.length(); i++) {
            if (Character.isUpperCase(str4.charAt(i))) return true;
        }
        return false;
    }

    //-----------------------------------------Task-5-----------------------------------------//
    public static int middleInt(int a, int b, int c) {
        int[] numbers5 = {a, b, c};
        Arrays.sort(numbers5);
        return numbers5[1];
    }

    //-----------------------------------------Task-6-----------------------------------------//
    public static int[] no13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    //-----------------------------------------Task-7-----------------------------------------//
    public static int[] arrFactorial(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= numbers[i]; j++) {
                factorial *= j;
            }
            numbers[i] = factorial;
        }
        return numbers;
    }

    //-----------------------------------------Task-8-----------------------------------------//
    public static String[] categorizeCharacters(String str8) {
        String[] arr = {"", "", ""};
        str8 = str8.trim();
        for (int i = 0; i < str8.length(); i++) {
            if (Character.isLetter(str8.charAt(i))) arr[0] += str8.charAt(i);
            else if (Character.isDigit(str8.charAt(i))) arr[1] += str8.charAt(i);
            else if (!Character.isWhitespace(str8.charAt(i))) arr[2] += str8.charAt(i);
        }
        return arr;
    }
}