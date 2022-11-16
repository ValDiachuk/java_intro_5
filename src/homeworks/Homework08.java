package homeworks;

import utilities.ScannerHelper;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("**************Task-1**************");

        String str1 = "hello";
        String str2 = "Java";
        String str3 = "";
        System.out.println(countConsonants(str1));
        System.out.println(countConsonants(str2));
        System.out.println(countConsonants(str3));


        System.out.println("**************Task-2**************");

        String s1 = "hello";
        String s2 = "java is  fun";
        String s3 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(s1)));
        System.out.println(Arrays.toString(wordArray(s2)));
        System.out.println(Arrays.toString(wordArray(s3)));


        System.out.println("**************Task-3**************");

        String words1 = "hello";
        String words2 = " Java  is    fun ";
        String words3 = "Hello,  nice  to  meet   you!!";
        System.out.println(removeExtraSpaces(words1));
        System.out.println(removeExtraSpaces(words2));
        System.out.println(removeExtraSpaces(words3));


        System.out.println("**************Task-4**************");

        String sentence = "";
        System.out.println(count3OrLess(sentence));


        System.out.println("**************Task-5**************");

        String dateOfBirth1 = "01/21/1999";
        String dateOfBirth2 = "1/20/1991";
        String dateOfBirth3 = "10/2/1991";
        String dateOfBirth4 = "12-20 2000";
        String dateOfBirth5 = "12/16/19500";
        System.out.println(isDateFormatValid(dateOfBirth1));
        System.out.println(isDateFormatValid(dateOfBirth2));
        System.out.println(isDateFormatValid(dateOfBirth3));
        System.out.println(isDateFormatValid(dateOfBirth4));
        System.out.println(isDateFormatValid(dateOfBirth5));


        System.out.println("**************Task-6**************");

        String email1 = "abc@gmail.com";
        String email2 = "abc@student.techglobal.com";
        String email3 = "a@gmail.com";
        String email4 = "abcd@@gmail.com";
        String email5 = "abc@gmail";
        System.out.println(isEmailFormatValid(email1));
        System.out.println(isEmailFormatValid(email2));
        System.out.println(isEmailFormatValid(email3));
        System.out.println(isEmailFormatValid(email4));
        System.out.println(isEmailFormatValid(email5));
    }

    public static int countConsonants(String str){
        return str.toLowerCase().replaceAll("[aeiou]","").trim().length();
    }


    public static String[]  wordArray(String str){
        str = str.replaceAll("\\s+", " ").trim();
        String[] arr = str.replaceAll("[^A-Za-z\\s]","").split(" ");
        return arr;
    }

    public static String removeExtraSpaces(String str){
        str = str.replaceAll("\\s+", " ").trim();
        return str;
    }

    public static int count3OrLess(String sentence){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        sentence = input.nextLine();
        String[] arr = sentence.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(arr));
        int wordCounter = 0;

        while(matcher.find()){
            wordCounter++;
        }
        return wordCounter;
    }

    public static boolean isDateFormatValid(String dateOfBirth){
        return Pattern.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}",dateOfBirth);
    }

    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w_.#&-]{2,}@[\\w_.#&-]{2,}\\.[\\w]{2,}",email);
    }
}





