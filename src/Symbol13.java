import java.util.Scanner;
public class Symbol13 {
public static void main (String [] args) {

    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter marks of Subject 1.");
    //int mark1 = sc.nextInt();

    //System.out.println("Enter marks of Subject 2.");
    //int mark2 = sc.nextInt();
    System.out.println("Enter First number : ");
    float num1 = sc.nextFloat();

    System.out.println("Enter Second number : ");
    float num2 = sc.nextFloat();
    //int num2 = sc.nextInt();

    System.out.println("Enter Second number : ");
    char sym = sc.next().charAt(0);

    if (sym == '+') {
        System.out.println(num1 + num2);
    }
    else if (sym == '-') {
        System.out.println(num1 - num2);
    }
    else if (sym == '*'){
        System.out.println(num1*num2);
    }
    else if (sym == '/'){
        System.out.println(num1/num2);
    }
    else{
        System.out.println("Invalid Symbol");
    }

}
}
