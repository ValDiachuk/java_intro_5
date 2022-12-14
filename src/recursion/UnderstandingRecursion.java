package recursion;

public class UnderstandingRecursion {

    public static void print(){
        System.out.println("Hello");
        print();
    }

    // Create a method that print number from 1 to given number

    public static void printNumbers (int end){
        for (int i = 0; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbersRecursively(int end){ //5
        if(end == 0) return;
        printNumbersRecursively(end -1); //5,4,3,2,1
        System.out.println(end);
    }

    public static void main(String[] args) {
       // print(); // StackOverFlowError

    }
}
