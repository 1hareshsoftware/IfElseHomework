import java.util.Scanner;

public class Vowel17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any single character : ");
        char value = sc.next().charAt(0);

        if ((value == 'a') || (value == 'A') || (value == 'e') || (value == 'E') || (value == 'i') || (value == 'I') || (value == 'o') || (value == 'O') || (value == 'u') || (value == 'U'))
                {
                    System.out.println(value + " is a Vowel");
        }
        else {
            System.out.println(value + " is a Consonent");
        }
    }}