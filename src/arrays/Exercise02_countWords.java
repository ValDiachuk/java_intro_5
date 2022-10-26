package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {

        /*
        count how many words in

         */

        String sentence = "I love arrays";

        System.out.println("\n------Solution 1 with toCharArray() method------\n");

        int countS = 0;

        for(char c : sentence.toCharArray()){
            if(c == ' ') countS++;
        }

        System.out.println(countS +  1);


        System.out.println("\n------Solution 2 with split() method------\n");

        System.out.println(sentence.split(" ").length); // 3

        }
    }

