package exeption_handling.custom_exeptions;

import utilities.ScannerHelper;

public class Permission {
    /*
    create a method called isAgeValid(), it will take the int as argument it will return true if age is more than 16,
    otherwise it throws an IllegalAccessException
     */

    public static boolean isAgeValid( int age) throws IllegalAccessException {

        if (age > 16 ) return true;
        throw new IllegalAccessException("Age of " + age + " ia restricted");
    }
    /*
Create a method that takes an int as an argument to state the day in the week
1 - Sunday
2 - Monday
7 - Saturday

method name = getCheckInHours()
if it is weekday user is allowed to check in from 10 AM to 5 PM -> Check in hours are from 10 AM to 5 PM
if it is weekend user is allowed to check in 10 AM to 3 PM -> Check in hours are from 10 AM to 3 PM
if the input is not in the range of 1-7, then throw an exception with message
"The input does not represent any day!!!"
 */
    public static String getCheckInHours(int day){
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("The input does not represent any day!!!");
        }
        if (day == 1 || day == 7) {
            return "Check in hours are from 10 AM to 3 PM";
        } else {
            return "Check in hours are from 10 AM to 5 PM";
        }
    }
}
