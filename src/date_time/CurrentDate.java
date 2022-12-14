package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("\n------------Date class-------------\n");
        Date date = new Date();
        System.out.println(date);

        System.out.println("\n------------LocalDate class-------------\n");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2022-12-11 yyy-MM-dd
        System.out.println(localDate.plusDays(7)); // 2022-12-18
        System.out.println(localDate.getEra()); //CE
        System.out.println(localDate.getMonth()); //DECEMBER
        System.out.println(localDate.getMonthValue()); //12
        System.out.println(localDate.getDayOfWeek());//SUNDAY
        System.out.println(localDate.getDayOfMonth()); // 11
        System.out.println(localDate.getDayOfYear()); //345


        System.out.println("\n------------LocalTime class-------------\n");
        LocalTime localTime = LocalTime.now(); //11:18:55.736 hh:mm:ss.SSS
        System.out.println(localTime);
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));


        System.out.println("\n------------LocalDateTime class-------------\n");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //2022-12-11T11:22:02.200  yyy-MM-dd Thh:mm:ss.SSS
    }
}
