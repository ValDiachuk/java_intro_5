package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n---------TASK-1----------\n");

        // System.out.println(countWords("      Java is fun       "));
        //System.out.println(countWords("Selenium is the most common UI automation tool.   "));

        System.out.println("\n---------TASK-2----------\n");

        //System.out.println(countA("TechGlobal is a QA bootcamp"));
        //System.out.println(countA("QA stands for Quality Assurance"));

        System.out.println("\n---------TASK-3----------\n");

        //System.out.println(countPos(new int[]{-45, 0, 0, 34, 5, 67}));
       //System.out.println(countPos(new int[]{-23, -4, 0, 2, 5, 90, 123}));

        System.out.println("\n---------TASK-4----------\n");

        //ArrayList<Integer> numbersR = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        ArrayList<Integer> numbersR = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(numbersR));

        System.out.println("\n---------TASK-5----------\n");

        //ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println(removeDuplicateElements(languages));

        System.out.println("\n---------TASK-6----------\n");

        String str6 = "   I   am      learning     Java      ";
        //String str6 = "Java  is fun          ";
        //String str6 = "";
        System.out.println(removeExtraSpaces(str6));

        System.out.println("\n---------TASK-7----------\n");

        //int[]arr1 = {3, 0, 0, 7, 5, 10};
        //int[]arr2 = {6, 3, 2};
        int[]arr1 =  {10, 3, 6, 3, 2};
        int[]arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("\n---------TASK-8----------\n");

        //int[]numbers8 = {10, -13, 5, 70, 15, 57};
        //int[]numbers8 = {10, -13, 8, 12, 15, -20};
        int[]numbers8 = {7, 0, 8, 5, 15, -15};
        System.out.println(indClosestTo10(numbers8));
    }

    public static int countWords (String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static int countAn (String str) {

        int count = 0;
        Pattern pattern = Pattern.compile("[aA]");

        for(char c : str.toCharArray()){
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if(matcher.matches()) count++;
        }
            return count;
        }

        public static int countPos (int[] numbers){

        int count = 0;
            for (int number : numbers) {
                if (number % 2 == 0)count++;

            }
            return count;
        }
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (Integer number : numbers) {
            if(!noDuplicates.contains(number))
                noDuplicates.add(number);
        }
        return noDuplicates;
    }
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> elements){
        ArrayList<String> arr = new ArrayList<>();
        for (String element : elements) {
            if(!arr.contains(element))
                arr.add(element);
        }
        return arr;
    }
    public static String removeExtraSpaces(String str){
        return str.replaceAll("\\s+", " ").trim();

}
    public static int[] add(int[] n1, int[] n2){
        if(n1.length > n2.length){
            for (int i = 0; i < n2.length; i++) {
                n1[i] += n2[i];
            }
        }
        else{
            for (int i = 0; i < n1.length; i++) {
                n2[i] += n1[i];
            }
        }
        if(n1.length > n2.length) return n1;
        return n2;
    }
    public static int indClosestTo10(int[] numbers){
        int closestTo10 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0 && 10 % numbers[i] < closestTo10)
                closestTo10 = numbers[i];
        }
        return closestTo10;
    }

}






