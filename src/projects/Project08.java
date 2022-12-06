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

        int[] arr = {2};
        //int[] arr = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(arr));

        System.out.println("\n**********Task-3**********\n");

         String str = "Hello";
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
        if (array.length < 2) return -1;
        Arrays.sort(array); // 4, 7, 8, 15
        int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff < smallestDiff) smallestDiff = diff;
        }
        return smallestDiff;
    }

    //--------- task-2 ---------//

    public static int findSingleNumber(int[] arr) {
        Arrays.sort(arr);
        // compare the next number, if it's the same, then we can skip that num
        // if its not the same, return it
        if (arr.length == 1) return arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) return arr[i];
            else i++;
        }
        return arr[arr.length - 1];
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

   /*
   public static int findMissingNumber(int[] arr) {
    Arrays.sort(arr);
    // you compare the next value and see if it is +1 of the current value
    // if it is, then continue, if not, return that missing next value
    for (int i = 0; i < arr.length -1; i++) {
        int expectedValue = arr[i] + 1, nextValue = arr[i + 1];
        if (nextValue != expectedValue) return expectedValue;
    }
    return 0;
}
    */
}
