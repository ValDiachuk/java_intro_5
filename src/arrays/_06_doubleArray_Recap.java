package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // create double array with these values
        // 1.5, 2.3, -1.3, -3.7
        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);

        // 1.5, 2.3, -1.3, -3.7 -> -3.7, -1.3, 1.5, 2.3
        Arrays.sort(decimals);
        System.out.println("Arrays after sorting " + Arrays.toString(decimals));
        System.out.println("\n Fori loop print below:");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }

        // When we don't need indexes or increment to use go with for each with arrays
        System.out.println("\nForeach loop print below");
        for (double d: decimals){
            System.out.println(decimals);
        }

    }
}
