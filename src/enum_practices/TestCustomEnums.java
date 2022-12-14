package enum_practices;

import java.time.Month;

public class TestCustomEnums {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);
        System.out.println(Days.SUNDAY);

        Days[] days = Days.values();
        for (Days d : days) {
            System.out.println(d);

        }
        System.out.println(Month.JANUARY);

        Month[] months = Month.values();

        for (Month month : months) {
            System.out.println(month);
        }

        for (Month m : Month.values()){
            System.out.println(m);
        }

    }
}
