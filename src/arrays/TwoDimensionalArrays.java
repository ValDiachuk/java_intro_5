package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}
        };

        System.out.println(students[0][1]); // Mehmet

        System.out.println(students[1][1]); // Regina
        System.out.println(students.length);



    }
}
