package homeworks;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("----------------------------------------*Task-1*----------------------------------------");

        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);

        System.out.println("----------------------------------------*Task-2*----------------------------------------");

        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("----------------------------------------*Task-3*----------------------------------------");

        String str = "abc$";
        System.out.println(findSumNumbers(str));
        str = "a1b4c  6#";
        System.out.println(findSumNumbers(str));
        str = "ab110c045d";
        System.out.println(findSumNumbers(str));
        str = "525";
        System.out.println(findSumNumbers(str));

        System.out.println("----------------------------------------*Task-4*----------------------------------------");

        str = "abc$";
        System.out.println(findBiggestNumber(str));
        str = "a1b4c  6#";
        System.out.println(findBiggestNumber(str));
        str = "ab110c045d";
        System.out.println(findBiggestNumber(str));
        str = "525";
        System.out.println(findBiggestNumber(str));

        System.out.println("----------------------------------------*Task-5*----------------------------------------");

        str = "";
        System.out.println(countSequenceOfCharacters(str));
        str = "abc";
        System.out.println(countSequenceOfCharacters(str));
        str = "abbcca";
        System.out.println(countSequenceOfCharacters(str));
        str = "aaAAa";
        System.out.println(countSequenceOfCharacters(str));

    }
    ////---------------------------------------Task-1---------------------------------------////
    /*
    Requirement:
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print
    numbers starting from 1 to given argument. BUT, it will print
    “Fizz” for the numbers divided by 3, “Buzz” for the numbers
    divided by 5, and “FizzBuzz” for the numbers divided both by 3
    and 5.
     */
    public static void fizzBuzz1(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");

            else if (i % 5 == 0)
                System.out.println("Buzz");

            else System.out.println(i);

        }
    }
    ////---------------------------------------Task-2---------------------------------------////
    /*
    Requirement:
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return
    a String. BUT it will return “Fizz” if the given number is
    divided by 3, “Buzz” if the number is divided by 5, and
    “FizzBuzz” if the number is divided both by 3 and 5.
    Otherwise, it will return number itself.
     */
    public static String fizzBuzz2(int n2) {

        if (n2 % 15 == 0) {
            return "FizzBuzz";
        } else if (n2 % 3 == 0) {
            return "Fizz";
        } else if (n2 % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n2);
        }
    }
    ////---------------------------------------Task-3---------------------------------------////
    /*
    Requirement:
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return
    an int which is the sum of all numbers presented in the String.
    NOTE: If there are no numbers represented in the String,
    return 0.
     */
    public static int findSumNumbers(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
    ////---------------------------------------Task-4---------------------------------------////
    /*
    Requirement:
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will
    return an int which is the number presented in the
    String.
    NOTE: If there are no numbers represented in the String,
    return 0.
    */
    public static int findBiggestNumber(String str) {

        String[] arr = str.split("[\\D]");
        int biggest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 0) continue;
            if(Integer.parseInt(String.valueOf(arr[i])) > biggest) biggest = Integer.parseInt(String.valueOf(arr[i]));
        }
        return biggest;
    }
    ////---------------------------------------Task-5---------------------------------------////
    /*
    Requirement:
    -Create a method called
     countSequenceOfCharacters()
    -This method will take a String argument and it will
    return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!
    */
    public static String countSequenceOfCharacters(String str){

        if (str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
            } else {
                count ++;
                result.append(count).append(str.charAt(i));
                count = 0;
            }
        }return result.toString();
    }
}