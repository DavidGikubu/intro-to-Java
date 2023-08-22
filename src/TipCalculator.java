/*here we are creating a tip calculator for you and your friend*/
import java.util.*;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to our tip calculator..!");
        System.out.println("what was the total bill? $ \n");
        float totalBill = reader.nextInt();
        System.out.println("how much tip would you like to give..10,12 OR 15?");
        short tip = reader.nextShort();
        System.out.println("how many people are splitting the bill?");
        short numberOfPeople = reader.nextShort();
        float tipInDecimal = ((float) tip / 100) + 1;
        float tipCalculator = (totalBill / numberOfPeople) * tipInDecimal;
        System.out.println("Each person should pay: $ "+ tipCalculator);
    }
}
