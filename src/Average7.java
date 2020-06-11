import java.util.Scanner;

public class Average7 {
    public static void main(String args[])
    {
        int numbers[] = new int[5];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<5; i++) {
            System.out.print("Enter numbers"+(i+1)+":");
            numbers[i] = scanner.nextInt();
            total = total + numbers[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print(avg);

    }

}
