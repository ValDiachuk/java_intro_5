package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {

        /*
        - they keep insertion order
        - they allow duplicates
        - they allow null elements

        - performance
        - memory
        - initial capacity
        - the way they store data
         */

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);
        System.out.println(fruits); // [Apple, Apple, Orange, , , null, null] // same for LinkedList and Vector

       LinkedList<String> fruits2 = new LinkedList<>();
       fruits2.add("Apple");
       fruits2.offer("Orange");
       fruits2.offerFirst("Pineapple");
        System.out.println(fruits2.element());
        System.out.println(fruits2.getFirst());

        System.out.println(fruits2);




    }
}
