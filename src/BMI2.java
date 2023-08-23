/*Write a program that interprets the Body Mass Index (BMI) based on a user's weight and height.

It should tell them the interpretation of their BMI based on the BMI value.

Under 18.5 they are underweight
Over 18.5 but below 25 they have a normal weight
Over 25 but below 30 they are slightly overweight
Over 30 but below 35 they are obese
Above 35 they are clinically obese.*/
import java.util.Scanner;
public class BMI2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to the updated version of our bmi calculator.");
        System.out.println("enter your height in metres: ");
        float height = reader.nextFloat();
        System.out.println("enter your weight in KGs: ");
        float weight = reader.nextFloat();
        float bmi = weight / (height * height);

        if(bmi < 18.5) {
            System.out.println("bmi = "+bmi + " you are underweight.");
        } else if (bmi > 18.5  && bmi <  25.0) {
            System.out.println("bmi = "+bmi + " you have normal weight.");
        } else if (bmi > 25.0 && bmi < 30) {
            System.out.println("bmi = "+bmi + " you are slightly overweight");
        }else if (bmi > 30 && bmi < 35.0) {
            System.out.println("bmi = "+bmi + " you are slightly obese.");
        }else {
            System.out.println("bmi = "+bmi + " you are clinically obese.");
        }
    }
}
