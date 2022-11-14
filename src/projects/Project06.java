package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Project06 {

    public static void main(String[] args) {

        System.out.println("=========TASK-1========");
        String [] words = {"foo", "", " " , "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(words));

        System.out.println("=========TASK-2========");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));

        System.out.println("=========TASK-3========");
        String password = "abcd1234";
        System.out.println(validatePassword(password));

        System.out.println("=========TASK-4========");
        String email = "abc@gmail.c";
        System.out.println(validateEmailAddress(email));

    }

    public static int countMultipleWords(String [] words){
        int counter = 0;
        for (String word : words) {
            word = word.trim();
            if(Pattern.matches("[\\w]+ [\\w ]+", word)) counter++;
        }
        return  counter;
    }

    public static ArrayList<Integer> removeNegatives (ArrayList<Integer> numbers){
        Iterator<Integer> negativeIterator = numbers.iterator();

        while(negativeIterator.hasNext()){
            Integer n = negativeIterator.next();
            if(n < 0) negativeIterator.remove();
        }
        return numbers;

    }

    public static boolean validatePassword (String password){
        return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#$%*&!?+_])[\\S]{8,16}" ,password));

    }

    public static boolean  validateEmailAddress (String email){
        return (Pattern.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}",email));

    }

}
