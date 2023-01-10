package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("----------------------------------------*Task-1*----------------------------------------");
        String str1 = "";
        System.out.println(hasLowerCase(str1));
        str1 = "JAVA";
        System.out.println(hasLowerCase(str1));
        str1 = "125$";
        System.out.println(hasLowerCase(str1));
        str1 = "hello";
        System.out.println(hasLowerCase(str1));

        System.out.println("----------------------------------------*Task-2*----------------------------------------");
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1));
        System.out.println(noZero(num2));
        num2 = new ArrayList<>(Arrays.asList(1, 1, 10));
        System.out.println(noZero(num2));
        num2 = new ArrayList<>(Arrays.asList(0, 1, 10));
        System.out.println(noZero(num2));
        num2 = new ArrayList<>(Arrays.asList(0, 0, 0));
        System.out.println(noZero(num2));

        System.out.println("----------------------------------------*Task-3*----------------------------------------");
        int[] numbers3 = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));
        numbers3 = new int[]{0, 3, 6};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));
        numbers3 = new int[]{1,4};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));

        System.out.println("----------------------------------------*Task-4*----------------------------------------");
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123"));

        System.out.println("----------------------------------------*Task-5*----------------------------------------");
        String str5 = "Hello";
        System.out.println(reverseSentence(str5));
        str5 = "Java is fun";
        System.out.println(reverseSentence(str5));
        str5 = "This is a sentence";
        System.out.println(reverseSentence(str5));

        System.out.println("----------------------------------------*Task-6*----------------------------------------");
        String str6 = "123Java #$%is fun";
        System.out.println(removeStringSpecialsDigits(str6));
        str6 = "Selenium";
        System.out.println(removeStringSpecialsDigits(str6));
        str6 = "Selenium 123#$%Cypress";
        System.out.println(removeStringSpecialsDigits(str6));

        System.out.println("----------------------------------------*Task-7*----------------------------------------");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));

        System.out.println("----------------------------------------*Task-8*----------------------------------------");
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
        new ArrayList<>(Arrays.asList("abc", "xyz", "123"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
        new ArrayList<>(Arrays.asList("Java", "C#", "Python"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")),
        new ArrayList<>(Arrays.asList("Python", "C#", "C++"))));

        System.out.println("----------------------------------------*Task-9*----------------------------------------");
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyz", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"))));
    }

    ////---------------------------------------Task-1---------------------------------------////
    public static boolean hasLowerCase(String str1){

        for (int i = 0; i < str1.length(); i++) {
            if(Character.isLowerCase(str1.charAt(i))) return true;
        }
        return false;
    }

    ////---------------------------------------Task-2---------------------------------------////
    public static ArrayList<Integer> noZero(ArrayList<Integer> num2){

        num2.removeIf(e -> e == 0);
        return num2;
    }

    ////---------------------------------------Task-3---------------------------------------////
    public static int[][] numberAndSquare(int [] array){

        int[][] result = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            result[i][0] = array[i];
            result[i][1] = array[i] * array[i];
        }
        return result;
    }

    ////---------------------------------------Task-4---------------------------------------////
    public static boolean containsValue(String[] words, String value){
        for (String word : words) {
            if(word.equals(value)) return true;
        }
        return false;
    }

    // return Arrays.asList(arr).contains(str);

    // Array


    ////---------------------------------------Task-5---------------------------------------////
    public static String reverseSentence(String str){
        String[] words = str.split(" ");
        if (words.length < 2) {
            return "There is not enough words!";
        }
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim().toLowerCase();
    }

    ////---------------------------------------Task-6---------------------------------------////
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[0-9_.#&%$]","");
        }

    ////---------------------------------------Task-7---------------------------------------////
    public static String[]removeArraySpecialsDigits(String[] arr){

        for (int i = 0; i < arr.length; i++) {
             arr[i] = arr[i].replaceAll("[^a-zA-Z ]", "");
        }
        return arr;
     }

    ////---------------------------------------Task-8---------------------------------------////
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        LinkedHashSet<String> set1 = new LinkedHashSet<>(arr1);
        LinkedHashSet<String> set2 = new LinkedHashSet<>(arr2);
        ArrayList<String> result = new ArrayList<>();
        for (String set : set1) {
            if(set2.contains(set)) result.add(set);
        }
        return result;
    }

    ////---------------------------------------Task-9---------------------------------------////
    public static ArrayList<String> noXInVariables(ArrayList<String> arrayList){
        ArrayList<String> result = new ArrayList<>();
        for (String s : arrayList) {
            result.add(s.replaceAll("[xX]",""));
        }
        result.remove("");
        return result;
    }
}