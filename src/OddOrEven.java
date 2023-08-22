import java.util.Scanner;

/*this is a program that checks whether th e number provided is even or odd.*/
public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to the odd or even programme.");
        System.out.println("enter a number.. ");
        int number = reader.nextInt();
        if (number % 2 == 0 ) {
            System.out.println( number +" is an even number.");
        }else {
            System.out.println(number + " is an odd number.");
        }
    }
}
