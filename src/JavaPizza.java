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
    
    int smallPizza = 1500;
    int mediumPizza = 2000;
    int largePizza = 2500;
    int peperoniSmall = 200;
    int peperoniMediumAndLarge = 300;
    int extraCheeseForAllSizes = 100;

    int bill;
    
    System.out.println("welcome to java pizza.");
    System.out.println("What Pizza size do you want? Small(S),Medium(M) or Large(L)?");
    String size  = reader.nextLine().toLowerCase();
    System.out.println("Add Peperoni? 'Y' for 'yes' and 'N' for 'no'. ");
    String peperoni = reader.nextLine().toLowerCase();
    System.out.println("Add extra cheese? 'Y' for 'yes' and 'N' for 'no'. ");
    String extraCheese = reader.nextLine().toLowerCase();
    
    if (size.equals("s") && peperoni.equals("y") && extraCheese.equals("y")) {
        bill = smallPizza + peperoniSmall + extraCheeseForAllSizes;
        System.out.println("your bill is " + bill);
    } else if (size.equals("s") && peperoni.equals("n") && extraCheese.equals("y")) {
        bill = smallPizza + extraCheeseForAllSizes;
        System.out.println("your bill is " + bill);
    } else if (size.equals("s") && peperoni.equals("n") && extraCheese.equals("n")) {
        bill = smallPizza;
        System.out.println("your bill is " + bill);
    } else if (size.equals("m") && peperoni.equals("y") && extraCheese.equals("y")) {
        bill = mediumPizza + peperoniMediumAndLarge + extraCheeseForAllSizes;
        System.out.println("your bill is " + bill);
    } else if (size.equals("m") && peperoni.equals("n") && extraCheese.equals("y")) {
        bill = mediumPizza + extraCheeseForAllSizes;
        System.out.println("your bill is " + bill);
    } else if (size.equals("m") && peperoni.equals("n") && extraCheese.equals("n")) {
        bill = mediumPizza;
        System.out.println("your bill is " + bill);
    } else if (size.equals("l") && peperoni.equals("y") && extraCheese.equals("y")) {
        bill = largePizza + peperoniMediumAndLarge  + extraCheeseForAllSizes;
        System.out.println("your bill is " + bill);
    } else if (size.equals("l") && peperoni.equals("n") && extraCheese.equals("y")) {
        bill = largePizza + extraCheeseForAllSizes;
        System.out.println("your bill is " + bill);
    }else if (size.equals("l") && peperoni.equals("n") && extraCheese.equals("n")) {
        bill = largePizza;
        System.out.println("your bill is " + bill);
        }
    }
}
