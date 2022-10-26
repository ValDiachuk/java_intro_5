package loops.while_loops;

public class Exercise02_PrintNumbersAscending {

    public static void main(String[] args) {
        System.out.println( "\n--------1st way beginner----------\n");
        for (int i = 1; i <= 10; i++) {
            if (i != 10 )System.out.print(i +" - ");
            else System.out.println(i);
        }
        System.out.println( "\n--------2nd way proper way----------\n");

        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " - ";
        }
        System.out.println(result.substring(0, result.length()-3));
    }
}