package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_countCharactersUsingScanner {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();
        int countL = 0;

        for (int i = 0;i < name.length(); i++) {
            if (name.toLowerCase().charAt(i)=='l')countL++;
        }
        System.out.println(countL);

    }
}

