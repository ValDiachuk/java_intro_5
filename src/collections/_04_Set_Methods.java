package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _04_Set_Methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Food");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");

        System.out.println(set); //[Bar, bar, abc, foo, xxx, Food]
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("ABC")); // true
        System.out.println(set.contains("abc")); // true
        System.out.println(set.remove("AAA")); // false
        System.out.println(set.remove("xxx")); // true
        System.out.println(set); //[Bar, bar, abc, foo, Food]
        System.out.println(set.equals(set)); // true
        System.out.println(set.removeIf(e -> e.toLowerCase().startsWith("b")));
        System.out.println(set);

        set.forEach(System.out::println);
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.hasNext());

        set.removeAll(set);
        set.clear();

        System.out.println(set.size()); //0
        System.out.println(set); //[]
    }
}
