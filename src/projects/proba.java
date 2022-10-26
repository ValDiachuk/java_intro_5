package projects;

import java.util.Random;

public class proba {
    public static void main(String[] args) {

        System.out.println("\n==========TASK-7==========\n");

        Random random = new Random();

        int randomNumber1 = random.nextInt(25) + 1;
        int randomNumber2 = random.nextInt(25) + 1;
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        for (int i = Math.min(randomNumber1, randomNumber2); i <= Math.min(randomNumber1, randomNumber2); i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
    }}
