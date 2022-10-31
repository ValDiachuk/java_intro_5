package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n---------TASK-1----------\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n---------TASK-2----------\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n---------TASK-3----------\n");

        ArrayList<Integer> task3Numbers = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));

        System.out.println(task3Numbers);

        Collections.sort(task3Numbers);
        System.out.println(task3Numbers);

        System.out.println("\n---------TASK-4----------\n");

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));
        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n---------TASK-5----------\n");

        ArrayList<String> marvelCharacters = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man",
                "Black Panter", "Deadpool", "Captain America"));
        System.out.println(marvelCharacters);
        boolean containWolwerine = false;

        for (String marvelCharacter : marvelCharacters) {
            if(marvelCharacter.equals("Wolwerine")) containWolwerine = true;
            break;
        }
        System.out.println(containWolwerine);

        System.out.println("\n---------TASK-6----------\n");





    }
}
