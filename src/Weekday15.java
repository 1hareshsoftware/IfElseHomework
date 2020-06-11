import java.util.Scanner;
public class Weekday15 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1-7");
        int No   = sc.nextInt();

        if (No == 1){
            System.out.println("Monday");
        }
        else if (No == 2){
            System.out.println("Tueday");
        }
        else if (No == 3){
            System.out.println("Wednesday");
        }
        else if (No == 4){
            System.out.println("Thursday");
        }
        else if (No == 5){
            System.out.println("Friday");
        }
        else if (No == 6){
            System.out.println("Saturday");
        }
        else if (No == 7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid Input, Please enter 1-7");
        }
    }



    }
