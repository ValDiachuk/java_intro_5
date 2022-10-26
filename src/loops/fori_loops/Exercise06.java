package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06 {
    public static void main(String[] args) {

        int num1 = ScannerHelper.getAnNumber();
        int num2 = ScannerHelper.getAnNumber();

        for (int i = Math.min(num1, num2); i <= Math.max(num1,num2); i++) {
            if (i %2 == 0) System.out.println(i);

        }

    }
}
