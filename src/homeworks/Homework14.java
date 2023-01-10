package homeworks;

public class Homework14 {
    public static void main(String[] args) {

     System.out.println("----------------------------------------*Task-1*----------------------------------------");

        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);

     System.out.println("----------------------------------------*Task-2*----------------------------------------");

    }

    ////---------------------------------------Task-1---------------------------------------////
    public static void fizzBuzz1(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");

            else if (i % 5 == 0)
                System.out.println("Buzz");

            else System.out.println(i);

            }
        }

    ////---------------------------------------Task-2---------------------------------------////
    }


