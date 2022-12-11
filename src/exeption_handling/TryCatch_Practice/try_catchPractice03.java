package exeption_handling.TryCatch_Practice;

public class try_catchPractice03 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5};
        try {
            System.out.println(numbers[5] * 5);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("end of the program");
    }
}