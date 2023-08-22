import java.util.*;
//A program that calculates the BodyMass Index from a users weight and Height
/*The BMI is a measure of someone's weight putting into account in their height.
e.g. If a tall person and a short person weigh the same amount the short person is normally overweight.
The BMI is calculated by dividing the user's weight in (KGs) by the square of their height in metres
*/
public class BMICalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to the BMI calculator.");
        System.out.println("enter your weight in Kgs: ");
        int weight = reader.nextInt();
        System.out.println("enter your height in meters: ");
        float height = reader.nextFloat();
        int BMI = (int) (weight/(height*height));
        System.out.println("your BMI is : " + BMI);
    }
}
