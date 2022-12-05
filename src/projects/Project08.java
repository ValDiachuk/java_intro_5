package projects;

import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

        System.out.println("\n**********Task-1**********\n");

       int[] array = {4};
       // int [] array = {4, 8, 7, 15};
       // int[] array = {10, -5, 20, 50, 100};
       System.out.println(findClosestDistance(array));

        System.out.println("\n**********Task-2**********\n");

        int[] numbers = {2};
        //int[] numbers = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(numbers));

        System.out.println("\n**********Task-3**********\n");

        // String str = "Hello";
        // String str = "abc abc d";
        //String str = "abab";
        System.out.println(findFirstUniqueCharacter(str));

        System.out.println("\n**********Task-4**********\n");

        int[] nums4 = {2, 4};
        //int[] nums4 = {2, 3, 1, 5};
        //int[] nums4 = {4, 7, 8, 6};
        System.out.println(findMissingNumber(nums4));
    }

    //--------- task-1 ---------//

    public static int findClosestDistance(int[] array) {

        int minDistance = Integer.MAX_VALUE;
        if (array.length < 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length - 1; j++) {
                    if (Math.abs(array[i] - array[j]) < minDistance) minDistance = Math.abs(array[i] - array[j]);
                }
            }
            return minDistance;
        }
        return -1;
    }

    //--------- task-2 ---------//

    public static int findSingleNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            int occur = 0;
        for (int j = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[j]) {
                occur++;
            }
        }
        if(occur == 1) return numbers [i];
     }
       return -1;
 }

    //--------- task-3 ---------//

 public static char findFirstUniqueCharacter(String str){

     for (int i = 0; i < str.length(); i++) {
         boolean isUnique = true;
         for (int j = 0; j < str.length(); j++) {
             if (i != j && str.charAt(i) == str.charAt(j)) {
                 isUnique = false;
                 break;
             }
         }
         if (isUnique)
             return str.charAt(i);
     }
     return ' ';
 }

    //--------- task-4 ---------//
 public static int findMissingNumber(int[] nums4){

        Arrays.sort(nums4);
        int result = 0;
        for(int i = 0; i < nums4.length -1; i++){
            if(Math.abs(nums4[i] - nums4[i+1]) == 2) result = nums4[i] + 1;
        }
     return result;
   }
}












