package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main (String[] args){

        // 1.
        String[] countries = new String[3];

        //2. assigning values to
        countries[1] = "Spain";

        //3. print a specific index

        System.out.println(countries[0]); //null
        System.out.println(countries[1]); // Spain

        //4. printing array
        System.out.println(Arrays.toString(countries));

        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries));

        //5. Update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries));

        //6. Getting the lenght og an array - now many elements - 3

        System.out.println(countries.length); //3

        //7. Printing each element separately
        System.out.println(countries[0]);
        System.out.println(countries[2]);
        System.out.println(countries[3]);

        for (int i = 0; i <=2 ; i++) {
            System.out.println("Country at index of" + i + " is = " + countries[i]);

        }
    }
}
