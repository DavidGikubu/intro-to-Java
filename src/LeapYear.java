/*Write a program that works out whether if a given year is a leap year
* A normal year has 365 days, leap years have 366, with an extra day in February
* The reason why we have leap years is really fascinating, this video does it more justice:
* https://www.youtube.com/watch?v=xX96xng7sAE
* This is how you work out whether if a particular year is a leap year.
* on every year that is evenly divisible by 4
**except** every year that is evenly divisible by 100
**unless** the year is also evenly divisible by 400*/
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.println("welcome to the leap year checker program.");
        System.out.println("enter a year: ");
        int year = reader.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400  == 0) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year +" is not a leap year.");
        }

    }
}
