package homeworks;

import java.util.ArrayList;

public class Homework09 {

    public static void main(String[] args) {

        System.out.println("\n**********Task-1**********\n");

        int[] numbers1 = {-8, 56, 7, 8, 65};
        // int[] numbers1 = {-4, 0, -7, 0, 5, 10, 45, 45};
        // int[] numbers1 = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        int duplicate = 0;
        boolean duplicateFount = false;

        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j] && !duplicateFount) {
                    duplicate = numbers1[i];
                    duplicateFount = true;
                    break;
                }
            }
        }
        System.out.println(duplicateFount ? duplicate : "There is no duplicates");


        System.out.println("\n**********Task-2**********\n");

        String[] words2 = {"a", "b", "B", "XYZ", "123"};
        // String[] words2 = {"Z", "abc", "z", "123", "#"};
        // String[] words2 = {"xyz", "java", "abc"};

        String duplicate2 = "";
        boolean duplicateFound2 = false;

        for (int i = 0; i < words2.length - 1; i++) {
            for (int j = i + 1; j < words2.length; j++) {
                if (words2[i].equalsIgnoreCase(words2[j]) && !duplicateFound2) {
                    duplicate2 = words2[i];
                    duplicateFound2 = true;
                    break;
                }
            }
        }
        System.out.println(duplicateFound2 ? duplicate2 : "There is no duplicates");


        System.out.println("\n**********Task-3**********\n");

        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        // int[] numbers3 = {1, 2, 5, 0, 7};

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if(numbers3[i] == numbers3[j] && !nums.contains(numbers3[i]))
                    nums.add(numbers3[i]);
            }
        }
        if(nums.isEmpty()) System.out.println("There is no duplicates");
        else nums.forEach(System.out::println);


        System.out.println("\n**********Task-4**********\n");

        String[] words4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        // String[] words4 = {"python", "foo", "bar", "java", "123" };

        String result = "";
        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if(words4[i].equalsIgnoreCase(words4[j]) && !result.contains(words4[i].toLowerCase())){
                    result += words4[i].toLowerCase();
                    System.out.println(words4[i]);
                }
            }
        }
        if(result.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n**********Task-5**********\n");

        String[] words5 = {"java", "python", "ruby"};
        // String[] words5 = {"abc", "foo", "bar"};

        ArrayList<String> arr = new ArrayList<>();

        for (int i = words5.length - 1; i >= 0 ; i--) {
            arr.add(words5[i]);
        }
        System.out.println(arr);


        System.out.println("\n**********Task-6**********\n");


        String str5 = "Today is a fun day";
        // String str5 = "Java is fun";

        String[] newStr = str5.split(" ");
        String answer = "";

        for (String s : newStr) {
            answer += new StringBuilder(s).reverse() + " ";
        }
        System.out.println(answer.substring(0,answer.length() - 1));

    }
}


