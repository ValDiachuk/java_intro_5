package homeworks;

import java.util.Arrays;
import java.util.Calendar;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n**********Task-1**********\n");
        //String str1 = "";
        //String str1 = "Java";
        //String str1 = "    Hello    ";
        //String str1 = " Hello World   ";
        String str1 = "Tech Globa";
        System.out.println(noSpace(str1));

        System.out.println("\n**********Task-2**********\n");
        //String str2 = "";
        //String str2 = "A";
        //String str2 = "    A       ";
        //String str2 = "Hello";
        String str2 = "Tech Global";
        System.out.println(replaceFirstLast(str2));

        System.out.println("\n**********Task-3**********\n");
        //String srt3 = "";
        //String srt3 = "Java";
        //String str3 = "1234";
        String str3 = "ABC";
        System.out.println(hasVowel(str3));

        System.out.println("\n**********Task-4**********\n");
        checkAge(2010); checkAge(2006); checkAge(2050);
        checkAge(1920);checkAge(1800);

        System.out.println("\n**********Task-5**********\n");
        int a = 0; int b = 0; int c = 0;
        System.out.println(averageOfEdges(a, b, c));
        a = 0;b = 0;c = 6;
        System.out.println(averageOfEdges(a, b, c));
        a = -2;b = -2;c = 10;
        System.out.println(averageOfEdges(a, b, c));
        a = -3;b = 15;c = -3;
        System.out.println(averageOfEdges(a, b, c));
        a = 10; b = 13; c = 20;
        System.out.println(averageOfEdges(a, b, c));

        System.out.println("\n**********Task-6**********\n");
        //String[] elements = {"java", "hello", "123", "xyz"};
        //String[] elements = {"appium", "123", "ABC", "java"};
        //String[] elements = {"appium", "123", "ABC", "java"};
        String[] elements = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(elements)));

        System.out.println("\n**********Task-7**********\n");
        //int[] numbers = {7, 4, 11, 23, 17};
        //int [] numbers = {3, 4, 5, 6};
        int[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(numbers)));

        System.out.println("\n**********Task-8**********\n");
        //int[] nums = {-10, -3, 0, 1};
        //int[] nums = {7, 4, 11, 23, 17};
        int[] nums = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(nums));
    }

    //-----------------------------------------Task-1-----------------------------------------//
    public static String noSpace(String str1) {
        str1 = str1.replaceAll("\\s", "");
        return str1;
    }
    //-----------------------------------------Task-2-----------------------------------------//
    public static String replaceFirstLast(String str2) {

        if (str2.length() < 2) {
            return "";
        } else {
            StringBuilder newString = new StringBuilder(str2);
            char first = newString.charAt(0);
            newString.setCharAt(0, newString.charAt(newString.length() - 1));
            newString.setCharAt(newString.length() - 1, first);
            return newString.toString();
        }
    }
    //-----------------------------------------Task-3-----------------------------------------//
    public static boolean hasVowel(String str3) {

        return str3.contains("a") || str3.contains("e") || str3.contains("o") || str3.contains("u") || str3.equalsIgnoreCase("I");
    }
    //-----------------------------------------Task-4-----------------------------------------//
    public static void checkAge(int yearOfBirth) {

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        if ((currentYear - yearOfBirth) > 100 || (yearOfBirth > currentYear)) System.out.println("AGE IS NOT VALID");
        else if ((currentYear - yearOfBirth) >= 16) System.out.println("AGE IS ALLOWED");
        else if ((currentYear - yearOfBirth) < 16) System.out.println("AGE IS NOT ALLOWED");
    }
    //-----------------------------------------Task-5-----------------------------------------//
    public static int averageOfEdges(int a, int b, int c) {

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.max(b, c));
        return (max + min) / 2;
    }
    //-----------------------------------------Task-6-----------------------------------------//
    public static String[] noA(String[] elements) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i].toLowerCase().startsWith("a"))
                elements[i] = "###";
        }
        return elements;
    }
    //-----------------------------------------Task-7-----------------------------------------//
    public static int[] no3or5(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 3 == 0) numbers[i] = 101;
            else if (numbers[i] % 5 == 0) numbers[i] = 99;
            else if (numbers[i] % 3 == 0) numbers[i] = 100;
        }
        return numbers;
    }
    //-----------------------------------------Task-8-----------------------------------------//
    public static int countPrimes(int[] nums) {
        int count = 0;

        for (int num : nums){
           if (num == 2 || num == 3) count++;
           else if (num > 3) {
               boolean isPrime = true;
               for (int i = 2; i < num; i++) {
                   if (num % i == 0) {
                       isPrime = false;
                   }
               }
               if (isPrime) count++;
           }
        }
        return count;
    }
}








