package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n---------TASK-1 and Task-2----------\n");

        int[] numbers = {10, 7, 7, 10, -3, 10, -3};

        findGreatestAndSmallestWithSort(numbers);
        findGreatestAndSmallest(numbers);

        System.out.println("\n---------TASK-3 and Task-4----------\n");

        int[] numbersSecond = {10, 5, 6, 7, 8, 5, 15, 15};

        findSecondGreatestAndSmallestWithSort(numbersSecond);
        findSecondGreatestAndSmallest(numbersSecond);

        System.out.println("\n--------------TASK-5----------------\n");

        String[] str = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        findDuplicatedElementsInAnArray(str);

        System.out.println("\n--------------TASK-6----------------\n");

        String [] elements = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        System.out.println(findMostRepeatedElementInAnArray(elements));

    }

    /*
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them.
    Complete task using sort() method.
    Test data:
    [10, 7, 7, 10, -3, 10, -3]
    Expected output:
    Smallest = -3
    Greatest = 10
     */

    public static void findGreatestAndSmallestWithSort(int[] numbers) {

        Arrays.sort(numbers);
        if (numbers.length > 0) {

            System.out.println("Smallest = " + numbers[0]);
            System.out.println("Greatest = " + numbers[numbers.length - 1]);

        }
    }

    public static void findGreatestAndSmallest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (max < n) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
        }
        if (numbers.length > 0) {
            System.out.println("Smallest = " + min);
            System.out.println("Greatest = " + max);
        }
    }

    public static void findSecondGreatestAndSmallestWithSort(int[] numbersSecond) {

        int secondSmallest = 0;
        int secondGreatest = 0;
        Arrays.sort(numbersSecond);

        for (int i = numbersSecond.length - 2; i >= 0; i--) {

            if (numbersSecond[i] != numbersSecond[numbersSecond.length - 1]) {
                secondGreatest = numbersSecond[i];
                break;
            }
        }

        for (int i = 0; i < numbersSecond.length; i++) {
            secondSmallest = numbersSecond[i+2];
            break;
        }
        System.out.println("Second smallest = " + secondSmallest);
        System.out.println("Second greatest = " + secondGreatest);
    }
    public static int findGreatest(int[] numbersSecond) {

        int max = Integer.MIN_VALUE;

        for (int num : numbersSecond) {
            if (num > max)
                max = num;
        }
        return max;
    }


    public static int findSmallest(int[] numbersSecond) {
        int min = Integer.MAX_VALUE;

        for (int num : numbersSecond) {
            if (num < min)
                min = num;
        }
        return min;
    }

    public static void  findSecondGreatestAndSmallest(int[] numbersSecond) {
        int secondGreatest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbersSecond) {
            if (num > secondGreatest && num < findGreatest(numbersSecond))
                secondGreatest = num;

            if (num < secondSmallest && num > findSmallest(numbersSecond))
                secondSmallest = num;
        }
        System.out.println("Second smallest = " + secondSmallest);
        System.out.println("Second greatest = " + secondGreatest);
    }

    public static void findDuplicatedElementsInAnArray(String[] str) {

        String duplicate = "";

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (duplicate.contains(str[i] + "")) {
                    break;
                }
                if (str[i] == str[j]) {
                    duplicate += str[i] + ",";
                }
            }
        }
        System.out.println(Arrays.toString(duplicate.split(",")));
    }

    public static String findMostRepeatedElementInAnArray(String[] elements){

    String repeatedElement = "";
    int count = 0;
    int maxCount = 0;

    for (String element : elements) {
        count = 1;
        for (String innerElement : elements) {
            if (element.equals(innerElement))
                count++;
            if (count > maxCount) {
                maxCount = count;
                repeatedElement = element;
            }
        }
    }
    return repeatedElement;
}
}











