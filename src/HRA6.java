import java.util.Scanner;

public class HRA6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Employee ID");
        int ID = sc.nextInt();
        System.out.println("Please enter Employee Name");
        String empname = sc.next();

        System.out.println("Please enter Basic Salary");
        int bsalary = sc.nextInt();

        int HRA = (bsalary*10)/100;
        System.out.println("HRA =" + HRA);

        int DA = (bsalary*8)/100;
        System.out.println("DA =" + DA);

        int TA = (bsalary*9)/100;
        System.out.println("TA =" + TA);

        int PF = (bsalary*20)/100;
        System.out.println("PF =" + PF);

        int Gsalary = bsalary + HRA + DA + TA - PF;
        System.out.println("Gross Salary = " + Gsalary);

        System.out.println( "Mr." + empname + "," + "ID No." + ID + " , " + "your Gross salary is " + Gsalary);

    }
}