package exeption_handling.custom_exeptions;

import utilities.ScannerHelper;

public class custim_exeptionsPractice {
    public static void main(String[] args) {

        int num = ScannerHelper.getAnNumber();

        switch ((num)){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new IllegalAccessError(num + "does not reflect any day");
        }
        System.out.println("End of the program");
    }
}
