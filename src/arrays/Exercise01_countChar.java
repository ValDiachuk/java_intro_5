package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {

        String word = "Java";

        int countA = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') countA++;
        }
                System.out.println(countA);

        /* String word = "Java"; // [J, a, v, a]

        int countA = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countA++;
        }

        System.out.println(countA);

         */

        }

    }
