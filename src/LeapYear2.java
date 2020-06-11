import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to find out Leap year ot not?");
        int year = sc.nextInt();

        if (year % 4 ==0){
            System.out.println(year  + " is the Leap Year");
        } else
            System.out.println(year  + " is not the Leap Year");
    }

}
