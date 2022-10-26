package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {

        //Create string array with a length of 4 (new way )

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));

        // Assign "Apple" to index of 0
        // Assign "kiwi" to index of 3
        // Then print the array again

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";
        System.out.println(Arrays.toString(fruits));

        // Assign "Grapes" to index of 1
        // Assign "Orange" to index of 2

        fruits[1] = "Grapes";
        fruits[2] = "Orange";

        System.out.println("\n Reassigning values");

        fruits[3] = fruits[0];
        fruits[2] = fruits [0];
        System.out.println(Arrays.toString(fruits));

        for (String singleFruit : fruits){
            System.out.println(singleFruit);
        }
    }
}
