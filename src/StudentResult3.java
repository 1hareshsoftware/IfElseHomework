import java.util.Scanner;
public class StudentResult3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String sname = sc.next();

        System.out.println("Enter Roll No.");
        int Rno = sc.nextInt();

        System.out.println("Enter marks of Subject 1.");
        int mark1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2.");
        int mark2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3.");
        int mark3 = sc.nextInt();

        int tmarks = mark1 + mark2 + mark3;
        float percentage = tmarks / 3f;
        System.out.println("Mr." + sname +"'s" + " result is: ");
        System.out.println("Total Marks = " + tmarks);
        System.out.println("Percentage = " + percentage);

        System.out.print(" Grade:");
        if (percentage >= 80){
            System.out.println("A+");
        }
        else if (percentage>= 60 && percentage <80){
            System.out.println("A");
        }
        else if (percentage>=50 && percentage <60){
            System.out.println("B");
        }
        else if (percentage>=35 && percentage <50){
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }

    }

}
