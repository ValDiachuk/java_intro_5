package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {

        //1. create an array to store - 5.5, 6, 10.3, 25
        double[] numbers = {5.5, 6, 10.3, 25};
        //2. print the array
        System.out.println(Arrays.toString(numbers));
        //3. print the size of the array
        System.out.println(numbers.length);

        System.out.println("\n-----------for-each loop______________\n");
        for (double number : numbers) {
            System.out.println(numbers);

        }
    }
}