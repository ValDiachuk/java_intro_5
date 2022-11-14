package homeworks;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

    }

    public static int countConsonants(String str) {
        str =str.toLowerCase();
         int counter = str.replaceAll("[aeiou]", "").trim().length();
         return counter;

        }



    }






