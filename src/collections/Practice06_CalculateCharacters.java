package collections;

import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {
        String str = "banana";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put (c, map.get(c) + 1);
        }
        System.out.println(map);


        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }

        /*
        Create method that takes a String as an argument
        and it returns the most occurred character in the string
        if there are more than one character that is counted most, then return all
        If the String is empty or null just return nothing
         */
        }
    public static Set<Character> getMostCounted (String str){

        /*
        1. Count all the unique characters
        2. Find the max occurrence
        3. Find all the characters that has the max count, put them
         */
          /*
        1. Count all the unique characters abcabcabc
            Key     values
            a       3
            b       3
            c       3

        2. Find the max occurrence // 3
        3. Find all the characters that has the max count, put them in a collection and return it back
         */
        Set<Character> result = new LinkedHashSet<>();

        if(str == null || str.isEmpty()) return result;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : str.toCharArray()) {
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        int maxCount = new TreeSet<>(map.values()).last(); // 3

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount) result.add(entry.getKey());
        }
        return result;
    }
}
