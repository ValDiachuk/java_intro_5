package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        LocalDate dateOfBirth = LocalDate.of(1991, Month.SEPTEMBER, 24);
        System.out.println(localDate);
        System.out.println(dateOfBirth);

        System.out.println(Period.between(dateOfBirth, localDate).getYears());
        System.out.println(Period.between(dateOfBirth, localDate).getMonths());
        System.out.println(Period.between(dateOfBirth, localDate).getDays());

        // Using ChronoUnit
        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, localDate));
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, localDate));
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, localDate));
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, localDate));

        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        // ChronoUnot
        System.out.println( ChronoUnit.HOURS.between(localTime1, localTime2));
        System.out.println( ChronoUnit.MINUTES.between(localTime1, localTime2));

    }
}
