package date_time;

import utilities.ScannerHelper;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {

        int age = ScannerHelper.getAnAge();
        System.out.println(LocalDate.now().getYear() - age);
        System.out.println(LocalDate.now().minusYears(age).getYear());
        System.out.println(LocalDate.now().minus(age, ChronoUnit.YEARS).getYear());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date of year");
        int dateOfYear = scanner.nextInt();
        System.out.println(LocalDate.now().getYear() - dateOfYear);



    }
}
