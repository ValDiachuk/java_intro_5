package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {


       //-----------------------------------------*Task-1*-----------------------------------------//
        //String str1 = "";
        //String str1 = "JAVA";
        //String str1 = "125$";
        String str1 = "hello";
        System.out.println(hasLowerCase(str1));

        //-----------------------------------------*Task-2*-----------------------------------------//

        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1));
        System.out.println(noZero(num2));

        //-----------------------------------------*Task-3*-----------------------------------------//

        int[] numbers3 = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));
        numbers3 = new int[]{0, 3, 6};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));
        numbers3 = new int[]{1,4};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));

    }

    //-----------------------------------------Task-1-----------------------------------------//
    public static boolean hasLowerCase(String str1){

        for (int i = 0; i < str1.length(); i++) {
            if(Character.isLowerCase(str1.charAt(i))) return true;
        }
        return false;
    }

    //-----------------------------------------Task-2-----------------------------------------//

    public static ArrayList<Integer> noZero(ArrayList<Integer> num2){

        num2.removeIf(e -> e == 0);
        return num2;

    }

    //-----------------------------------------Task-3-----------------------------------------//

    public static int[][] numberAndSquare(int [] array){
        int[][] result = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            result[i][0] = array[i];
            result[i][1] = array[i] * array[i];
        }
        return result;
    }

    //-----------------------------------------Task-4-----------------------------------------//

    public static boolean containsValue(String[] words, String value){
        for (String word : words) {
            if(word.equals(value)) return true;
        }
        return false;

    }

    public static String reverseSentence(String str){
        String[] array = str.split(" ");
        if( array.length < 2 ) System.out.println("There is not enough words");


    }

}
