    import java.util.Scanner;
    public class Interchange5 {
        public static void main(String[] args) {
            int x;
            int y;
            int z;
            Scanner in = new Scanner(System.in);

            System.out.println("Input the first number: ");
            x = in.nextInt();
            System.out.println("Input the second number: ");
            y = in.nextInt();

            z = x;
            x = y;
            y = z;

            System.out.println(" Interchange numbers:" + x + " and " + y);
        }
    }



