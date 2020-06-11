import java.util.Scanner;

public class Vote11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Age?");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You are eligible for the vote");
        } else
            System.out.println("You are not eligible for the vote");
    }
}

