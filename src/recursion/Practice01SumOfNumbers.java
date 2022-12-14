package recursion;

public class Practice01SumOfNumbers {
    /*
Create a public static method called as sum
It takes an int which is a positive number
It returns the sum of numbers starting from 1 to given int

5 -> 1+2+3+4+5 -> 15
 */
    public static int sum (int end){
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            sum+= i;
        }
        return sum;
    }

    /*
Create a public static method called as sum
It takes an int which is a positive number
It returns the sum of numbers starting from 1 to given int

5 -> 1+2+3+4+5 -> 15
 */


    public static int sumRecurs(int end ){
        if(end != 0) return end + sumRecurs(end -1 );
        return 0;
    }

    public static int productRecurs(int end ){
        if(end == 1) return 0;
        return end * productRecurs(end -1 );
    }

    public static String reverseStringRecurs (String str){
        if ((str == null) || (str.length() <= 1)) {
            return str;
        }
        return reverseStringRecurs(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {

        System.out.println(reverseStringRecurs("hello"));
        System.out.println(sum(5));
        System.out.println(sum(7));
        System.out.println(sumRecurs(5));
        System.out.println(sumRecurs(7));

        System.out.println(productRecurs(5));

    }
}
