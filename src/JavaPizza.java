/*build an automatic pizza order program.
* Based on a user's order, work out their final bill.
* Small Pizza: $15
* Medium Pizza: $20
* Large Pizza: $25
* Pepperoni for Small Pizza: +$2
* Pepperoni for Medium or Large Pizza: +$3
* Extra cheese for any size pizza: + $1*/
import java.util.*;
public class JavaPizza {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.println("welcome to java pizza.");
        System.out.println("Size: 'Y' for 'yes' and 'N' for 'no'. ");
        String size  = reader.nextLine();
        System.out.println("Add Peperoni? 'Y' for 'yes' and 'N' for 'no'. ");
        String peperoni = reader.nextLine();
        System.out.println("Add extra cheese? 'Y' for 'yes' and 'N' for 'no'. ");
        String extraCheese = reader.nextLine();
    }
}
