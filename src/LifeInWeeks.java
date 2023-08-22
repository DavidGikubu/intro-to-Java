import java.util.*;
//I was previously reading Tim urban article life in weeks and realised how little time we have.
//https://waitbutwhy.com/2014/05/life-weeks.html
/*Create a program using maths and f-Strings that tells us how many days, weeks, months we have left if we live until 90 years old.
It will take your current age as the input and output a message with our time left in this format:
*/
public class LifeInWeeks {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.println("welcome to your life in weeks calculator.");
        System.out.println("what is your current age?: ");
        short currentAge = reader.nextShort();
        short yearsRemaining = (short) (90 - currentAge);
        int monthsRemaining = yearsRemaining * 12;
        int weeksRemaining = yearsRemaining * 52;
        int daysRemaining = yearsRemaining * 365;
        System.out.println(yearsRemaining + "years\n" + monthsRemaining + "months\n" + weeksRemaining + "weeks\n"  + daysRemaining + "days\n");
    }
}
