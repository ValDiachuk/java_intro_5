package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_RemoveDuplicates {

    public static void main(String[] args) {

           /*
        Assume you have an ArrayList of languages as below
        Java
        JavaScript
        Ruby
        Go
        Java
        Ruby
        Java
        EXPECTED:
        [Java, JavaScript, Ruby, Go]
        Uniques
         */

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"));
        ArrayList<String> uniques = new ArrayList<>();

        for (String language : languages) {
            if(!uniques.contains(language)) uniques.add(language);

            // System.out.println(new HashSet<>(languages));
        }

        System.out.println(uniques);
    }
}







