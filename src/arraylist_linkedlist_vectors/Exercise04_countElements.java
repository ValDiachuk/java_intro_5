package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_countElements {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));
        /* numbers.removeIf(x -> x % 2 == 1);
        System.out.println(numbers.size());
        System.out.println(numbers);
         */
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count()); //3
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).count()); //2
        System.out.println(numbers.stream().filter(x -> x > 15).count()); //3
        System.out.println(numbers.stream().filter(x -> x != 20).count()); //4





    }
}
