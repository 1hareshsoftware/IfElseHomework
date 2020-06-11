import java.util.Scanner;
public class Positive8 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value");
        int No = sc.nextInt();

        if (No == 0){
            System.out.println("Zero");
        }
        else if (No > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

    }

    }
