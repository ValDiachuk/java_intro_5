package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        // 1.Declaring an array vs an ArrayList
        String [] names1 = new String[3];


        ArrayList<String> names2 = new ArrayList<>(); // capacity = 10 by default

        //2. Getting the size of array vs ArrayList

        System.out.println("\n ----------- Size of array vs ArrayList------------\n");
        System.out.println("The size of array = " + names1.length); //3
        System.out.println("The size of ArrayList = " + names2.size()); //0

        //3. Printing an array vs ArrayList
        System.out.println("\n ----------- Printing array vs ArrayList------------\n");
        System.out.println("The array = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2); // []

        //4. Adding


        names1[1] = "Ali";
        names1[2] = "Andrii";


        names2.add("Joe");
        names2.add("Jane");
        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println("The ArrayList = " + names2); //[Joe, Jane, Abdallah, Vlad, Saeed, Hazal, Yildiz, Samir]
        System.out.println("The size = " + names2.size()); //10

        //5. Updating an existing element
        names1[1] = "Mike";
        names2.set(1, "Olena");
        System.out.println(names2);

    }
}
