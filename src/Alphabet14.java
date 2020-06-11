import java.util.Scanner;

public class Alphabet14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number, alphabet or symbol : ");
        char value = sc.next().charAt(0);

        if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {

            System.out.println(value + " is alphabet.");

        } else if(value >= '0' && value <= '9') {

            System.out.println(value + " is number.");

        } else {

            System.out.println(value + " is symbol.");
        }

    }

}
