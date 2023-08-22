// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        byte myAge = 40;
        if(myAge < 18){
            System.out.println("you are way too young.");
        } else if (myAge >18 && myAge < 25) {
            System.out.println("you are at your pre-prime youth age");
        }else if (myAge > 25 && myAge < 30) {
            System.out.println("you are at your prime age.");
        }else{
            System.out.println("You are ready to settle with someone");
        }
    }
}