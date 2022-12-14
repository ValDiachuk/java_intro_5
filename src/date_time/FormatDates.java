package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {

    public static void main(String[] args){

        System.out.println("\n-------------Formatting Date--------------\n");

        Date date = new Date();
        System.out.println(date); //Sun Dec 11 11:34:47 CST 2022 - EEE MMM dd hh:mm:ss z yyyy

        // print the date in the format of MM/dd/yyyy

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date));

        formatter = new SimpleDateFormat("yyyy");
        System.out.println(formatter.format(date));

        System.out.println(new SimpleDateFormat("yyyy").format(new Date()));
        System.out.println(new SimpleDateFormat("hh 'o' 'clock' a, zzzz").format(new Date()));


    }
}
