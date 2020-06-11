import java.util.Scanner;

public class Salary9 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sales ID");
        int ID = sc.nextInt();

        System.out.println("Please enter Seller Name");
        String sname = sc.next();

        System.out.println("Please enter Sales Amount");
        int samount = sc.nextInt();

        System.out.println("Please enter Basic Salary");
        int bsalary = sc.nextInt();

        if (samount >= 50000) {
            System.out.println("Mr " + sname + "," + "Your Sales commission is " + samount * 35 / 100);
            System.out.println("Mr " + sname + "," + "Your Sales commission with Basic salary is " + (+samount * 35 / 100+ bsalary));
        }
        else if (samount >= 35000) {
            System.out.println("Mr " + sname + "," + "Your Sales commission is " + samount * 20 / 100);
            System.out.println("Mr " + sname + "," + "Your Sales commission with Basic salary is " + (samount * 20 / 100+ bsalary));
        }
        else if (samount >= 20000) {
            System.out.println("Mr " + sname + "," + "Your Sales commission is " + samount * 10 / 100);
            System.out.println("Mr " + sname + "," + "Your Sales commission with Basic salary is " + (samount * 10 / 100+ bsalary));
        }
        else if (samount >= 10000) {
            System.out.println("Mr " + sname + "," + "Your Sales commission is " + samount * 5 / 100);
            System.out.println("Mr " + sname + "," + "Your Sales commission with Basic salary is " + (samount * 5 / 100+ bsalary));
        }
        else {
            System.out.println("Mr " + sname + "," + "Your Sales commission is " + samount * 2 / 100);
            System.out.println("Mr " + sname + "," + "Your Sales commission with Basic salary is " + (samount * 2 / 100+ bsalary));
        }

    }

}
