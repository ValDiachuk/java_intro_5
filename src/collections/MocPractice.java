package collections;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class MocPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 3, 5, 5, 6, 7,};
        System.out.println(secMax(numbers));

        String str = "Valentyna1234";
        System.out.println(sumOfNumbersInString(str));

        Integer[] n = {2, 3, 3, 3, 6,};
        System.out.println(Arrays.toString(removeDups(n)));

        //Integer[] nm = {9, 8, 5, 6,};
        // System.out.println(Arrays.toString(lessThenN(7, true)));
        System.out.println(Arrays.toString(lessThenN(n, 7)));


    }

    public static Integer secMax(int[] numbers) {

        TreeSet<Integer> nums = new TreeSet<>();
        for (Integer i : numbers) {
            nums.add(i);
        }
        return nums.higher(nums.first());

    }

    public static int sumOfNumbersInString(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    public static Integer[] removeDups(Integer[] numbers) {

        HashSet<Integer> num = new HashSet<>(Arrays.asList(numbers));
        Integer[] newArray = num.toArray(new Integer[0]);
        return newArray;
    }

    public static Integer[] lessThenN(Integer[] arr, int n) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        return set.headSet(n, true).toArray(new Integer[0]);
    }

    public static Integer min(Integer[] arr) {
        return new TreeSet<>(Arrays.asList(arr)).first();
    }

    public static Integer max(Integer[] arr2) {
        return new TreeSet<>(Arrays.asList(arr2)).last();


    }
}

