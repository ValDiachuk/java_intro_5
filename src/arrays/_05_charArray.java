package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

        System.out.println("\n--------------TASK-1----------------");

        /*
       TASK-1
       Create a char array and store values below
#
$
5
A
b
H

Print the array

       EXPECTED:
       [#, $, 5, A, b, H]
       */

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n--------------TASK-2----------------");

        /*
TASK-2
Print the size of the array with a message

EXPECTED:
The size of the array is = 6
 */

        System.out.println("The size of the array is ");

        System.out.println("\n--------------TASK-3----------------");

        /*
        TASK-3
        Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);

            System.out.println("\n--------------TASK-4----------------");

            for (char element : characters) {
                System.out.println(element);

                System.out.println("\n--------------TASK-5----------------");

              /*
TASK-5
Print each element that are letters

EXPECTED:
A
b
H
 */          for(char elements : characters){
                    if(Character.isLetter(elements)) System.out.println(elements);
                }


                System.out.println("\n----------TASK-5 - fori loop-----------\n");
                for (int j = 0; j < characters.length; i++) {
                    if(Character.isLetter(characters[j])) System.out.println(characters[j]);
                }
                System.out.println("\n----------TASK-6 - fori loop-----------\n");
                /*
               TASK-6
                Count how many uppercase characters you have in the array

                EXPECTED:
                2
                */
                int countU1 = 0;
                for(char elements : characters){



                }

                }


            }

        }
    }




