package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "JohnDoe_123"));
        System.out.println(Pattern.matches("[\\w\\-]{8,15}", "JohnDoe_123")); //any letters numbers and underscore
        System.out.println(Pattern.matches(" .+  ", "JohnDoe_123")); //
        System.out.println(Pattern.matches("[a-z]+", "")); //
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000")); //SSN NNN-NN-NNNN
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(630)-123-4567")); // phone number

        String str = "abc123$#^";
        System.out.println(str.replace("$#^", ""));
        System.out.println(str.replaceAll("[\\W]", ""));
        System.out.println(str.replaceAll("[\\W_]", ""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}", "John Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+", "John Doe"));

        str = "##A1%%b2#$%C^&3";
        //[A, b, C]
        //[1, 2, 3]
        System.out.println(Arrays.toString(str.replaceAll("[^A-Za-z]","").toCharArray()));//AbC
        System.out.println(Arrays.toString(str.replaceAll("[\\D]","").split("")));//A123

    }
}
