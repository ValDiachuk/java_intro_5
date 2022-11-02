package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

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
        System.out.println(marvelCharacters.contains("Wolwerine"));

        System.out.println("\n---------TASK-6----------\n");

        ArrayList<String> avengers = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        Collections.sort(avengers);
        System.out.println(avengers);

        boolean containHulk = false;
        boolean containIronMan = false;

        for (String avenger : avengers) {
            if (avenger.equals("Hulk")) containHulk = true;
            else if (avenger.equals("Iron Man")) containIronMan = true;

            if (containHulk && containIronMan) break;
        }
        System.out.println(containHulk && containIronMan);

        System.out.println("\n---------TASK-7----------\n");

        ArrayList<Character> char7 = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(char7);

        for (Character character : char7) {
            System.out.println(character);
        }

        System.out.println("\n---------TASK-8----------\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int countM = 0;
        int countHaveAAndE = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) countM++;
            if(object.contains("A") || object.contains("a") || object.contains("E") || object.contains("e")) countHaveAAndE++;
        }
        System.out.println(countM);
        System.out.println(objects.size() - countHaveAAndE );


        System.out.println("\n---------TASK-9----------\n");
        int startUpper = 0;
        int startLower = 0;
        int containP = 0;
        int startOrEndsWithP = 0;


        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(kitchenObjects);

        for (String kitchenObject : kitchenObjects) {

            if (Character.isUpperCase(kitchenObject.charAt(0))) startUpper++;
            else startLower++;

            if (kitchenObject.contains("P") || kitchenObject.contains("p")) containP++;
            if (kitchenObject.startsWith("P") || kitchenObject.endsWith("p")) startOrEndsWithP++;
        }

        System.out.println("Elements starts with uppercase = " + startLower);
        System.out.println("Elements starts with lowercase = " + startUpper);


        System.out.println("\n---------TASK-10----------\n");

        ArrayList<Integer> givenNumbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(givenNumbers);
        int counter10 = 0;
        int evenGreater15 = 0;
        int oddLessThen20 = 0;
        int less15Greater50 = 0;

        for (Integer givenNumber : givenNumbers) {
            if(givenNumber % 10 == 0) counter10++;
            if (givenNumber % 2 == 0 && givenNumber > 15) evenGreater15++;
            if (givenNumber % 2 != 0 && givenNumber < 20 ) oddLessThen20++;
            if (givenNumber < 15 || givenNumber > 50) less15Greater50++;
            }
        System.out.println("Elements that can be divided by 10 = " + counter10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + oddLessThen20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);

        }
    }








