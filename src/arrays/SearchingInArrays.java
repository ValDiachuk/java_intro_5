package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 10};

//Search for 7 and return true if it exists in this array, return false otherwise -> false

        boolean has7 = false;

        for (int number : numbers) {
            if (number == 7) {
                has7 = true;
                break;
            }
        }
            System.out.println(has7); // false

//Search for 5 and return true if it exists in this array, return false otherwise -> true

            boolean has5 = false;

            for (int number : numbers)
                if (number == 5){
                    has5 = true;
                    break;
                }
        System.out.println(has5);

        System.out.println("\n----------Binary search in arrays--------\n");
        // Binary search can be search if array is sorted ONLY, otherwise you will get wrong results

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5)); // 1
        System.out.println(Arrays.binarySearch(numbers, 10)); // 3
        System.out.println(Arrays.binarySearch(numbers, 1)); // -something

        }
    }

