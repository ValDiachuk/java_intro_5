package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));


/*
TASK
Remove elements that contains "book"
-This is case-insensitive

Print the list -> [Pen, Pencil]
 */

        Iterator<String> objectIterator = objects.iterator();

        while(objectIterator.hasNext()){
            String o = objectIterator.next();
            if(o.toLowerCase().contains("book")) objectIterator.remove();
        }
        System.out.println(objects);
    }
}
