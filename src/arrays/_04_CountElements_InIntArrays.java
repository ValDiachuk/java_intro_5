package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {


        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

    /*
    negatives: 2
    positives: 3
    neutral or zero

    even: 6
    odd:4

    max :10
    min: -7

    sum of the all numbers; 28
    average of the numbers
    how many of those numbers are represented in fibonacci sequences: 6
    how many unique numbers : 7
    prime numbers: 2
    how many numbers can be divided by 5: 6
     absolute different between max and min : 17
     closest number to 9  (take a left): 8
     */

        int negatives = 0;
        for (int number : numbers) {
            if (number < 0) negatives++;
        }
        System.out.println("Negative count is " + negatives);

        int positives = 0;
        for (int number : numbers) {
            if (number > 0) positives++;
        }
        System.out.println("Positive count is " + positives);


        int even = 0;
        for (int number : numbers) {
            if (number % 2 == 0) even++;
        }
        System.out.println("Even count is " + even);

        // second solution

        int even1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even1++;
        }
        System.out.println(even1);
    }
}



